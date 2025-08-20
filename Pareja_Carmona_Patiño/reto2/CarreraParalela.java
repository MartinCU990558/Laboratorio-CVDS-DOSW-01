package reto2;

import java.util.Arrays;
import java.util.List;

public class CarreraParalela {
    private static List<Integer> numeros = Arrays.asList(5, 12, 3, 8, 15, 1);

    public static int encontrarNumMayor() {
        return numeros.stream()
                .max((a, b) -> a.compareTo(b))
                .get();
    }
}

