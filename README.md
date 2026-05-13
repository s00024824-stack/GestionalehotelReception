# Gestionale Reception Hotel - Progetto Java SE

### Overview
Applicazione per la gestione delle tariffe e dell'occupazione di un hotel, progettata per essere sicura e scalabile secondo i principi di programmazione difensiva.

### Tecnologie e Design Patterns
* **Composite Pattern**: Utilizzato tramite l'interfaccia `ElementoHotel` per gestire in modo uniforme diverse tipologie di camere (Singole, Doppie).
* **Exception Shielding**: Implementato tramite `HotelException` e blocchi try-catch per nascondere i dettagli tecnici (Stack Trace) e prevenire vulnerabilità di sicurezza.
* **Java I/O**: Persistenza dei dati tramite esportazione automatica di report in formato `.txt`.
* **JUnit Testing**: Suite di test inclusa per la verifica della logica di calcolo delle tariffe.

### Documentazione
* **Diagramma UML**: Disponibile nella cartella schema UML del progetto (formato .png). Mostra la gerarchia delle classi e l'implementazione del pattern Composite.

### Istruzioni
1. Eseguire la classe `Main` per visualizzare il report a console e simulare le operazioni di check-in.
2. Al termine dell'esecuzione, verificare la creazione del file `report_hotel.txt` nella root del progetto.