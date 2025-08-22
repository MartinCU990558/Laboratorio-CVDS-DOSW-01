package Pareja_Bermudez_Palacios.Reto2;

import java.util.function.Function;

public class EcoMisterioso {

    public static String ecoMisterioso(String mensaje) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) { 
                sb.append(" ");
            }
        }

        return new StringBuffer(sb.toString()).reverse().toString();
    }

    public static void main(String[] args) {

        Function<String, String> ecoLambda = EcoMisterioso::ecoMisterioso;

        String resultado = ecoLambda.apply("Hola");
        System.out.println(resultado); 
}