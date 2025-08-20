package Idarraga_Estupinan.Reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).get();
    }


    public static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream().min(Integer::compare).get();
    }
    
}