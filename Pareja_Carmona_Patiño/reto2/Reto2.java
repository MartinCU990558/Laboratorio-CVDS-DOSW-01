package reto2;

import java.util.Arrays;
import java.util.List;

public class Reto2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12,43,15,24,39);
        List<Integer> list2 = Arrays.asList(15,40,1,8,18,28,11);
        int[] datosList1 = CarreraParalela.obtenerDatosCarrera(list1);
        int[] datosList2 = CarreraParalela.obtenerDatosCarrera(list2);
        System.out.println("Número mayor Lista 1: " + datosList1[0]);
        System.out.println("Número mayor Lista 2: " + datosList2[0]);
        System.out.println("============================================");
        System.out.println("Número menor Lista 1: " + datosList1[1]);
        System.out.println("Número menor Lista 2: " + datosList2[1]);
        System.out.println("============================================");
        System.out.println("Cantidad de elementos Lista 1: " + list1.size());
        System.out.println("Cantidad de elementos Lista 2: " + list2.size());
        System.out.println("============================================");
        System.out.println("El mayor de Lista 1 es multiplo de 2: " + (datosList1[3] == 1 ? "Si" : "No"));
        System.out.println("El mayor de Lista 1 es divisor de 2: " + (datosList1[4] == 1 ? "Si" : "No"));
        System.out.println("El mayor de Lista 2 es multipl de 2: " + (datosList2[3] == 1 ? "Si" : "No"));
        System.out.println("El mayor de Lista 2 es divisor de 2: " + (datosList2[4] == 1 ? "Si" : "No"));
        System.out.println("============================================");
        System.out.println("La cantidad de elementos de Lista 1 es par: " + (datosList1[5] == 1 ? "Si" : "No"));
        System.out.println("La cantidad de elementos de Lista 2 es par: " + (datosList2[5] == 1 ? "Si" : "No"));
        System.out.println("============================================");


    }
}
