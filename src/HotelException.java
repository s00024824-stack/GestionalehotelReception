public class SistemaEccezioni extends Exception{
    public SistemaEccezioni (String messaggio){
        super("SISTEMA HOTEL - AVVISO:" + messaggio);
    }
}
