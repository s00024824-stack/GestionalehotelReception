/**
 * gestione camere doppie e la possibilita del letto aggiuntivo.
 */
public class CameraDoppia extends Camera {
    private boolean supplementoLetto;

    public CameraDoppia(int numero, double prezzo, boolean supplementoLetto) {
        super(numero, prezzo);
        this.supplementoLetto = supplementoLetto;
    }

    @Override
    public double calcolaTotale(int notti) {
        double totale = getPrezzoNotte() * notti;
        //  extra forfettario se c'è il letto aggiunto
        if (supplementoLetto) {
            totale += (25.0 * notti);
        }
        return totale;
    }
}