package Idarraga_Estupinan.Reto2;

import java.util.List;

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

        return "El número máximo es: " + max + ", el número mínimo es: " + minimo + ", la cantidad de números es: " + conteo + ", el máximo es múltiplo de 2: " + maxMultiploDeDos;
    }
}