import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SalvataggioDati {
    private static final String NOME_FILE = "report_hotel.txt";

    public static void esportaReport(List<ElementoHotel> inventario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_FILE))) {
            writer.write("--- REPORT GESTIONALE HOTEL ---\n");
            for (ElementoHotel e : inventario) {
                writer.write("Stanza ID: " + e.getId() + " - Tariffa: " + e.calcolaTotale(1) + "€\n");
            }
            System.out.println("LOG [INFO]: Report esportato con successo in " + NOME_FILE);
        } catch (IOException e) {

            System.out.println("LOG [SECURITY]: Errore critico durante la scrittura del file.");
        }
    }
}