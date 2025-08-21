package Pareja_Barros_Astudillo.reto2;

import java.util.*;

public class CarreraParalela {

    public static String resultadoLista(List<Integer> numeros) {
        int max = numeros.stream().max(Integer::compare).orElseThrow();
        int min = numeros.stream().min(Integer::compare).orElseThrow();
        int cantidad = numeros.size();

        // Nueva lógica: múltiplo2 y divisor2
        List<Integer> multiplos2 = new ArrayList<>();
        List<Integer> divisores2 = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 == 0) {
                multiplos2.add(num);
            }
            if (2 % num == 0) {
                divisores2.add(num);
            }
        }

        return "Maximo: " + max +
               ", Minimo: " + min +
               ", Cantidad: " + cantidad +
               ", Multiplos de 2: " + multiplos2 +
               ", Divisores de 2: " + divisores2;
    }
}


