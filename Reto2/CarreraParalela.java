package Idarraga_Estupinan.Reto2;

import java.util.List;

public class CarreraParalela {

    public static int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).get();
    }


    public static int calcularMinimo(List<Integer> numeros) {
        return numeros.stream().min(Integer::compare).get();
    }
<<<<<<< HEAD
    
    public static ResumenLista analizar(List<Integer> numeros) {
    
        
        int maximo = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int conteo = numeros.size();
        
=======

    public static ResumenLista analizar(List<Integer> numeros) {
        int maximo = calcularMaximo(numeros);
        int minimo = calcularMinimo(numeros);
        int conteo = numeros.size();
>>>>>>> 95b6d9f427adb24e1d7ebbfd9845b202b3a5a783
        return new ResumenLista(maximo, minimo, conteo);
    }
}