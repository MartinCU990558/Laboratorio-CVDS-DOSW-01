package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    private List<Integer> numeros = Arrays.asList();

    public CarreraParalela(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public static int encontrarNumMayor(List<Integer> numeros){
        return numeros.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

    }
    
    public static int[] hallarMinimoYNumeroTotalDeDatos(List<Integer> numeros){
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

    public int[] obtenerDatosCarrera(){
        int[] datos = new int[4];
        datos[0] = encontrarNumMayor(numeros);
        datos[1] = hallarMinimoYNumeroTotalDeDatos(numeros)[0];
        datos[2] = hallarMinimoYNumeroTotalDeDatos(numeros)[1];
        datos[3] = (encontrarNumMayor(numeros) % 2 == 0) ? 1 : 0;
        return datos;

    }
}

