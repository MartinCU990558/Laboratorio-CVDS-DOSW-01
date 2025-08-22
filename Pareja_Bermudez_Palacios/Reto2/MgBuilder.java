package Pareja_Bermudez_Palacios.Reto2;

import java.util.stream.IntStream;

public class MgBuilder {
    public static String repetirMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String resultado = repetirMensaje("Hola");
        System.out.println(resultado);
    }

}
