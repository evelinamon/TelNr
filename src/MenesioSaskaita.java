public class MenesioSaskaita {
    private int userId;
    private int menuo;
    private int suma;
    private String telNr;

    @Override
    public String toString() {
        return "MenesioSaskaita{" +
                "userId=" + userId +
                ", menuo=" + menuo +
                ", suma=" + suma +
                ", telNr='" + telNr + '\'' +
                '}';
    }

    public MenesioSaskaita(int userId, int menuo, int suma, String telNr){
        this.userId=userId;
        this.menuo=menuo;
        this.suma=suma;
        this.telNr=telNr;
    }
}
