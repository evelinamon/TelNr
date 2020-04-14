import java.util.ArrayList;
import java.util.HashMap;

public class Pagalbine {
    public static void spausdink(ArrayList<Saskaita> sarasas, HashMap<String, TelNr> telNrHM) {
        for (Saskaita p : sarasas) {
            TelNr telNr = telNrHM.get(p.getTelNr());
            System.out.println("User Id: " + telNr.getUserId() + " " + p);
        }
        System.out.println();
    }

    public static HashMap<Integer, ArrayList<VisaSaskaita>> klientuSaskaitos(ArrayList<Saskaita> saskaitos, HashMap<String, TelNr> telNrHM) {
        HashMap<Integer, ArrayList<VisaSaskaita>> klientuSaskaitos = new HashMap<>(); //sukuriame HashMap'a key -> userId value -> ArrayList kuris laiko visasSaskaitas
        for (Saskaita saskaita : saskaitos) { //Pereiname per Saskaita
            TelNr telNr = telNrHM.get(saskaita.getTelNr()); //key <- saskaita.getTelNr, value <- telNr
            VisaSaskaita visaSaskaita = new VisaSaskaita(saskaita.getTelNr(), saskaita.getMenuo(), saskaita.getSuma(), telNr.getUserId());
            //sukuriame visa saskaita ir uzpildome duomenimis apie klienta
            ArrayList<VisaSaskaita> visosSaskaitos = klientuSaskaitos.get(telNr.getUserId()); //nieko negauname pirma karta antra karta arraylist
            if (visosSaskaitos == null) {//jeigu nieko nera
                ArrayList<VisaSaskaita> naujosSaskaitos = new ArrayList<>();
                naujosSaskaitos.add(visaSaskaita);
                klientuSaskaitos.put(telNr.getUserId(), naujosSaskaitos);
            } else {
                visosSaskaitos.add(visaSaskaita);
            }
        }
        return klientuSaskaitos;
    }

    public static void rezultatas(HashMap<Integer, ArrayList<VisaSaskaita>>duomenys) {
        for (int userId : duomenys.keySet()) {//einame per hashmapo key kolekcija
            for (int menuo = 1; menuo <= 12; menuo++) {
                int suma = 0;
                for (VisaSaskaita saskaita : duomenys.get(userId)) {
                    if (menuo == saskaita.getMenuo()){
                        suma += saskaita.getSuma();
                    }
                }
                if (suma != 0) {
                    ArrayList<VisaSaskaita> sas = duomenys.get(userId);
                    ArrayList<String> telefonoNumeriai = new ArrayList<>();
                    for (VisaSaskaita m : sas){
                        if (menuo == m.getMenuo()) {
                            telefonoNumeriai.add(m.getTelNr());
                        }
                    }
                    System.out.println("UserId = " + userId + " menuo = " + menuo + " moketi = " + suma + " naudoti tel nr " + telefonoNumeriai);
                }
            }
        }
    }
}
