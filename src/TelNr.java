import java.util.Comparator;

public class TelNr implements Comparator {

    private String telNr;
    private int userId;

    public TelNr() {}

    @Override
    public String toString() {
        return "Telefono numeris: " + getTelNr()
                + " userId: " + getUserId();
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}