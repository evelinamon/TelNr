public class VisaSaskaita {
    private String telNr;
    private int menuo;
    private int suma;
    private int userId;
    public VisaSaskaita(String telNr, int menuo, int suma, int userId){
        this.setTelNr(telNr);
        this.setMenuo(menuo);
        this.setSuma(suma);
        this.setUserId(userId);
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
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
        this.suma = suma;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return  "telNr='" + telNr + '\'' +
                ", menuo=" + menuo +
                ", suma=" + suma +
                ", userId=" + userId;
    }
}
