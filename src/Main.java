import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, TelNr> numeriai = DuomenuNuskaitymas.nuskaitytiVisusTelefonoNumeriusHM("Json_files\\TelNr.json");
        ArrayList<Saskaita> saskaitos = DuomenuNuskaitymas.nuskaitytiVisasSaskaitas("Json_files\\Saskaita.json");

        System.out.println(numeriai);
        System.out.println(saskaitos);

        System.out.println("Rusiuojama naudojant Comparator:");
        ShellSort.shellSort(saskaitos, new SaskaitosComparator(numeriai));
        Pagalbine.spausdink(saskaitos, numeriai);

        HashMap<Integer, ArrayList<VisaSaskaita>> duomenys = Pagalbine.klientuSaskaitos(saskaitos, numeriai); //iskvieciam funkcija klienu saskaitos
        System.out.println();

        Pagalbine.rezultatas(duomenys);
    }
}