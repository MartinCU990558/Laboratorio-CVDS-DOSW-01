package Idarraga_Estupinan.Reto2;

import java.security.DrbgParameters.Reseed;
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

        ResumenLista r = new ResumenLista(maximo, minimo, conteo);
        r.maximo_MultiploDe2 = maximo % 2 == 0 ? true : false;
        return r;
        
    }


}