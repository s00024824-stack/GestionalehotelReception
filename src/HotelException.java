public class HotelException extends Exception{
    public HotelException(String messaggio){
        super("SISTEMA HOTEL - AVVISO:" + messaggio);
    }
}
