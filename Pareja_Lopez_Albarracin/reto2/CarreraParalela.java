package Pareja_Lopez_Albarracin.reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 10, 2, 8, 20);

        Resultados r = CarreraParalela.combineResults(lista);

        System.out.println(r);
    }

    public static int biggerNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

    public static int minimumNumber(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).get();
    }

    public static Resultados combineResults(List<Integer> numbers){
        int max = biggerNumber(numbers);
        int min = minimumNumber(numbers);
        int n   = numbers.size();

        boolean esMultiplo = (max % 2 == 0) ? true : false;
        boolean esDivisor = (2 % max == 0) ? true : false;

        return new Resultados(max, min, n, esMultiplo, esDivisor);
    }
}