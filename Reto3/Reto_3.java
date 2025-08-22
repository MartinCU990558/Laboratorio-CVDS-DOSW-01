package Idarraga_Estupinan.Reto3;

import java.util.*;
import java.util.List;
import java.util.stream.*;

public class Reto_3 {

    public static String estA_Builder(String mensaje) {

        String men_repetido = IntStream.range(0, 3).mapToObj(i -> mensaje).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    public static String estB_Buffer(String mensaje) {

        StringBuffer sbf = new StringBuffer(mensaje);
        return sbf.reverse().toString();
    }

    public static String ecoMensaje(String mensaje) {
        String repetido = IntStream.range(0, 3).mapToObj(i -> mensaje).collect(Collectors.joining(" "));

        StringBuilder sb = new StringBuilder(repetido);
        StringBuffer sbf = new StringBuffer(sb.toString());
        return sbf.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Entrada: Saludos ");
        System.out.println("Salida:  " + ecoMensaje("Saludos"));
    }
}