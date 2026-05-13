public abstract class Camera implements ElementoHotel {
    private int numeroStanza;
    private double prezzoNotte;
    private boolean occupata;

    public Camera(int numeroStanza, double prezzoNotte) {
        this.numeroStanza = numeroStanza;
        this.prezzoNotte = prezzoNotte;
        this.occupata = false;
    }

    // Getters standard
    public int getId() { return numeroStanza; }
    public double getPrezzoNotte() { return prezzoNotte; }
    public boolean isOccupata() { return occupata; }
    public void setOccupata(boolean occupata) { this.occupata = occupata; }

    public abstract double calcolaTotale(int notti);
}
