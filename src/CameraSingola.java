public class CameraSingola extends Camera {
    public CameraSingola(int numero, double prezzo) { super(numero, prezzo); }

    @Override
    public double calcolaTotale(int notti) { return getPrezzoNotte() * notti; }
}

