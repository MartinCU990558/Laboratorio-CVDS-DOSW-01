package Idarraga_Estupinan.Reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).get();
    }


    public static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream().min(Integer::compare).get();
    }

    
    public static ResumenLista analizar(List<Integer> numeros) {
    
        
        int maximo = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int conteo = numeros.size();
        return new
        ResumenLista(maximo, minimo, conteo);

        System.out.println("prueba");
    }
}