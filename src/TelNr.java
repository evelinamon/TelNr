/*
    A JavaBean is a Java object that satisfies certain programming conventions:
    - instance variables should be private
    - public setter and getter methods
    - no-arg constructor
*/
public class TelNr{

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
}