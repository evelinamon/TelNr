import java.util.Comparator;
import java.util.HashMap;

public class SaskaitosComparator implements Comparator<Saskaita> {//privalo override metodus

    private HashMap<String, TelNr> telNrMap;

    public SaskaitosComparator(HashMap<String, TelNr> telNrMap) {
        this.telNrMap = telNrMap;
    }

    @Override
    public int compare(Saskaita saskaita1, Saskaita saskaita2) {

        //pagal userId ir tada menesį

        int menuo1 = saskaita1.getMenuo();
        int menuo2 = saskaita2.getMenuo();

        TelNr telNr1 = telNrMap.get(saskaita1.getTelNr());
        TelNr telNr2 = telNrMap.get(saskaita2.getTelNr());

        int p1 = telNr1.getUserId();
        int p2 = telNr2.getUserId();

        if (p1>p2) return 1;
        else if (p1<p2) return -1;
        else {
            return Integer.compare(menuo1, menuo2);
        }
        // pagal menesį o vęliau pagal userId
        /*
        if (menuo1 > menuo2) return 1;
        else if (menuo1 < menuo2) return -1;
        else {
            return Integer.compare(p1, p2);
        }*/
    }
}


