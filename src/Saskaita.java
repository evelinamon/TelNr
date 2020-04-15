public class Saskaita{//extendina kita klase

    private String telNr;
    private int menuo;
    private int suma;

    public Saskaita() {
    }

    @Override
    public String toString() {//pavercia i teksta
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
}
