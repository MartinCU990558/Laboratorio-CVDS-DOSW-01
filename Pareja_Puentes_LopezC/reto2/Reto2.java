package reto2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reto2{
    public static final java.util.function.Function<List<Integer>, Optional<Integer>> ENCONTRAR_MAXIMO = 
        lista -> lista.stream()
                     .max(Integer::compareTo);
    public static void main(String[] args) {
     List<Integer> numeros = Arrays.asList(23, 45, 12, 67, 89, 34, 56);
     Integer maximo = ENCONTRAR_MAXIMO.apply(numeros);
    }
}