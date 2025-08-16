package reto3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mensaje {
    public static String ecoConBuilder(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(""));
        return new StringBuilder(repetido).toString();
    }
    public static String ecoConBuffer(String mensaje){
        return new StringBuffer(mensaje).reverse().toString();
    }
    public static String eco(String mensaje){
        String repetido = IntStream.range(0,3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(""));
        return new StringBuffer(repetido).reverse().toString();

    }
}
