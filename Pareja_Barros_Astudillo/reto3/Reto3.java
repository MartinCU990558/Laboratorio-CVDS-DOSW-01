package Pareja_Barros_Astudillo.reto3;

import java.util.function.Function;

public class Reto3 {
    // Método usando StringBuilder (repetir 3 veces)
    public static String procesarMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Function<String, String> lambda = Reto3::procesarMensaje;
        System.out.println(lambda.apply("Hola"));
    }
}