import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class DuomenuNuskaitymas {
    // konstruktorius tam kad niekas negaletu sukurti objekto, jokiu fieldu nenaudojame, metodai yra universalus
    private DuomenuNuskaitymas() {
    }
    //<T> metodas kuris tures savo tipa, T return type
    private static <T> T nuskaityti(String fileName, TypeToken<T> typeToken){ //1) T - hashmap <string,Telnr>
        try {
            InputStream inputStream = new FileInputStream(fileName);
            Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            Gson gson = new GsonBuilder().create(); //is json i javaBean
            T sarasas = gson.fromJson(reader, typeToken.getType()); //1) konvertuojam i hashmapa kuris turi java beansus
            reader.close();
            return sarasas;
        } catch (FileNotFoundException e) {
            System.out.println("Klaidingai ivestas failo pavadinimas:  " + fileName);
        } catch (IOException e) {
            System.out.println("Nepavyko uzdaryti failo");
        }
        return null;
    }
    //static funkcijos kurios nepriklauso objektui
    public static HashMap<String,TelNr> nuskaitytiVisusTelefonoNumeriusHM(String fileName) {
        return nuskaityti(fileName, new TypeToken<>(){});
    }

    public static ArrayList<Saskaita> nuskaitytiVisasSaskaitas(String fileName) {
        return nuskaityti(fileName, new TypeToken<>(){});
    }
}
