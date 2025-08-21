package reto5;
import java.util.*;
import java.util.stream.*;


public class Reto5{

    static HashSet<Integer> ceroTres(HashSet<Integer> numeros){
        return numeros.stream().filter(x -> x % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        
        HashSet<Integer> ceroNumeros3 = ceroTres(numeros);

        System.out.println(ceroNumeros3);

        
    }
}