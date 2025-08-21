package Pareja_Barros_Astudillo.reto2;

import java.util.*;

public class CarreraParalela {
    public static String minimoYCantidad(List<Integer> numeros) {
        int min = numeros.stream().min(Integer::compare).orElseThrow();
        int cantidad = numeros.size();
        return "Minimo: " + min + ", Cantidad: " + cantidad;
    }
}
