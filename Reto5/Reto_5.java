package Idarraga_Estupinan.Reto5;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Reto_5 {

    public static HashSet<Integer> hash(List<Integer> numeros) {

        HashSet<Integer> num_aleatorios = new HashSet<>(numeros);
        return (HashSet<Integer>) num_aleatorios.stream().filter(n -> n % 3 != 0).collect(Collectors.toSet());
    }

}    