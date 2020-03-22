public class Saskaita implements Comparable<Saskaita> {

    private String telNr;
    private int menuo;
    private int suma;

    public Saskaita() {
    }

    @Override
    public String toString() {
        return " telefono numeris " + getTelNr()
                + " menuo " + getMenuo()
                + " suma= " + getSuma();
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        telNr = telNr;
    }

    public int getMenuo() {
        return menuo;
    }

    public void setMenuo(int menuo) {
        this.menuo = menuo;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
    }

    @Override
    public int compareTo(Saskaita o) {
        return 0;
    }
}
