package Idarraga_Estupinan.Reto3;

import java.util.*;
import java.util.List;
import java.util.stream.*;

public class Reto_3 {

    public static String estA_Builder(String mensaje) {

        String men_repetido = IntStream.range(0, 3).mapToObj(i -> mensaje).collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

}