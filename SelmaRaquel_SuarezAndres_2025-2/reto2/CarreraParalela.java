package SelmaRquel_SuarezAndres_2025.reto2;
import java.util.*;





public class CarreraParalela {

    public static class Stats {

        public static Integer maximo(List<Integer> datos) {
            return datos.stream().mapToInt(Integer::intValue).max().orElse(0);
        }


        public static Map.Entry<Integer,Integer> minimoYConteo(List<Integer> datos) {
            int min = datos.stream().mapToInt(Integer::intValue).min()
                    .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
            int count = datos.size();
            return Map.entry(min, count);
        }


        public static Stats combinarBasico(List<Integer> datos) {
            int max = maximo(datos);
            Map.Entry<Integer, Integer> minYc = minimoYConteo(datos);
            int min = minYc.getKey();
            int count = minYc.getValue();

            return int;


        }







    }
}