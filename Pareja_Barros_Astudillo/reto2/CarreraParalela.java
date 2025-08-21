package Pareja_Barros_Astudillo.reto2;

import java.util.*;

public class CarreraParalela {
    public static int maximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).orElseThrow();
    }
}