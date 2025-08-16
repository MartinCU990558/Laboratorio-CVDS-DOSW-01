package reto3;

public class Mensaje {
    public static String ecoConBuffer(String mensaje){
        return new StringBuffer(mensaje).reverse().toString();
    }
}
