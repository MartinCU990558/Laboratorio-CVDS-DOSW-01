package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    private static List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 15, 1);

    public static int encontrarNumMayor() {
        return numeros.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
    }

    public static int[] hallarMinimoYNumeroTotalDeDatos(){
        int minimo = numeros.stream()
                .min((a, b) -> a.compareTo(b))
                .get();
        long totalDatos = numeros.stream()
                .count();
        
        int [] resultado = new int[2];
        resultado[0] = minimo;
        resultado[1] = (int) totalDatos;
        
        return resultado;

    }
}

