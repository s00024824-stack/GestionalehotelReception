/**
 * un'interfaccia comune  per trattare una singola camera o un intero piano.
 * Permette di calcolare i costi in modo polimorfico.
 * ho usato   il pattern Iterator per scorrere gli elementi
 */
import java.util.Iterator;
public interface ElementoHotel {
    double calcolaTotale(int notti);
    int getId();
}