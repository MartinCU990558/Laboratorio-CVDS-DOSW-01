package Pareja_Barros_Astudillo.reto3;

import java.util.function.Function;

public class Reto3 {
    // Método usando StringBuffer (invertir)
    public static String procesarMensaje(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        Function<String, String> lambda = Reto3::procesarMensaje;
        System.out.println(lambda.apply("Hola"));
    }
}