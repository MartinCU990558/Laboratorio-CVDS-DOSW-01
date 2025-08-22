package Idarraga_Estupinan.Reto2;

import java.util.List;
import java.util.*;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).get();
    }


    public static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream().min(Integer::compare).get();
    }

    public static String analizar(List<Integer> numeros) {
        int max = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int conteo = numeros.size();

        boolean maxMultiploDeDos = (max % 2 == 0) ? true : false;
        boolean maxDivisorDeDos = (2 % max == 0 && max != 0) ? true : false;

        boolean conteoImpar = (conteo % 2 != 0) ? true : false;
        boolean conteoPar = (conteo % 2 == 0) ? true : false;

        return "El número máximo es: " + max + ", el número mínimo es: " + minimo + ", la cantidad de números es: " + conteo + ", el máximo es múltiplo de 2: " + maxMultiploDeDos;

    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(8, 5, 2, 9, 4, 11, 3, 6, 7, 1);
        List<Integer> lista2 = List.of(1, 2, 4, 2, 2, 7, 3, 5, 6, 8);

        System.out.println("Lista 1 -> " + analizar(lista1));
        System.out.println("Lista 2 -> " + analizar(lista2));
    }
}
