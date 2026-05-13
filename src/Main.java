public class Main {
    public static void main(String[] args) {

        GestoreReception reception = new GestoreReception();

        try {
            System.out.println("LOG [INFO]: Avvio sistema Gestionale Reception...");

            ElementoHotel s1 = new CameraSingola(101, 80.0);
            ElementoHotel d1 = new CameraDoppia(202, 120.0, true);
            ElementoHotel s2 = new CameraSingola(102, 85.0);

            reception.aggiungiElemento(s1);
            reception.aggiungiElemento(d1);
            reception.aggiungiElemento(s2);

            reception.generaReport();


            reception.salvaReportSuFile();

            System.out.println("\n--- Simulazione Check-out ---");
            double totaleCheckIN = d1.calcolaTotale(3);
            System.out.println("Totale Camera " + d1.getId() + " per 3 notti: " + totaleCheckIN + "€");

        } catch (Exception e) {
            System.out.println("LOG [SECURITY]: Si è verificato un errore nel calcolo. Contattare l'assistenza.");
        }
    }
}
