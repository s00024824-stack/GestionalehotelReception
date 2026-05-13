import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class GestoreReception {
    private List<ElementoHotel> inventario;

    public GestoreReception() {
        this.inventario = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoHotel e) {
        if (e != null) {
            inventario.add(e);
        } else {
            System.err.println("Errore: Elemento nullo");
        }
    }

    public void generaReport() {
        System.out.println("--- Stato Occupazione Hotel ---");
        System.out.println("Elementi in lista: " + inventario.size());
        for (ElementoHotel elemento : inventario) {
            System.out.println("ID: " + elemento.getId() + " | Tariffa: " + elemento.calcolaTotale(1) + "€");
        }
    }


    public void salvaReportSuFile() {
        try (FileWriter writer = new FileWriter("report_hotel.txt")) {
            writer.write("--- Report Esame Hotel ---\n");
            for (ElementoHotel e : inventario) {
                writer.write("ID: " + e.getId() + " - Prezzo: " + e.calcolaTotale(1) + "€\n");
            }
        } catch (IOException e) {
            System.err.println("Errore I/O: " + e.getMessage());
        }
    }
}