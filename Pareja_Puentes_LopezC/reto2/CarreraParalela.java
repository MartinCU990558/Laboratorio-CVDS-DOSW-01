package reto2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarreraParalela {
    public static final java.util.function.Function<List<Integer>, Optional<Integer>> ENCONTRAR_MAXIMO = 
        lista -> lista.stream()
                     .max(Integer::compareTo);

        public static void main(String[] args) {
        System.out.println("");
    }
}