package SelmaRquel_SuarezAndres_2025.reto2;
import java.util.*;
import java.util.function.Function;

public class CarreraParalela {


    public static class Stats {
        public final int max;
        public final int min;
        public final int count;
        public final boolean maxEsMultiploDe2;
        public final boolean maxEsDivisorDe2;
        public final boolean countPar;
        public final boolean countImpar;

        public Stats(int max, int min, int count,
                     boolean maxEsMultiploDe2, boolean maxEsDivisorDe2,
                     boolean countPar, boolean countImpar) {
            this.max = max;
            this.min = min;
            this.count = count;
            this.maxEsMultiploDe2 = maxEsMultiploDe2;
            this.maxEsDivisorDe2 = maxEsDivisorDe2;
            this.countPar = countPar;
            this.countImpar = countImpar;
        }

        @Override public String toString() {
            return "Stats{max=" + max + ", min=" + min + ", count=" + count +
                    ", max%2==0=" + maxEsMultiploDe2 +
                    ", 2%max==0=" + maxEsDivisorDe2 +
                    ", countPar=" + countPar +
                    ", countImpar=" + countImpar + "}";
        }
    }

    public static class ResultadosDosListas {
        public final Stats listaA;
        public final Stats listaB;

        public ResultadosDosListas(Stats listaA, Stats listaB) {
            this.listaA = listaA;
            this.listaB = listaB;
        }

        @Override public String toString() {
            return "Resultado{\n  listaA=" + listaA + ",\n  listaB=" + listaB + "\n}";
        }
    }


    public static int maximo(List<Integer> datos) {
        return datos.stream().mapToInt(Integer::intValue).max()
                .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
    }


    public static Map.Entry<Integer,Integer> minimoYConteo(List<Integer> datos) {
        int min = datos.stream().mapToInt(Integer::intValue).min()
                .orElseThrow(() -> new IllegalArgumentException("Lista vacía"));
        int count = datos.size();
        return Map.entry(min, count);
    }


    public static Stats combinarBasico(List<Integer> datos) {
        int max = maximo(datos);
        Map.Entry<Integer,Integer> minYc = minimoYConteo(datos);
        int min = minYc.getKey();
        int count = minYc.getValue();


        boolean maxEsMultiploDe2 = (max % 2 == 0) ? true : false;
        boolean maxEsDivisorDe2  = (2 % Math.abs(max) == 0) ? true : false;


        boolean countPar  = (count % 2 == 0) ? true : false;
        boolean countImpar= (count % 2 != 0) ? true : false;

        return new Stats(max, min, count, maxEsMultiploDe2, maxEsDivisorDe2, countPar, countImpar);
    }


    public static ResultadosDosListas fusionFinal(List<Integer> listaA, List<Integer> listaB) {

        Function<List<Integer>, Stats> procesar = CarreraParalela::combinarBasico;
        return new ResultadosDosListas(procesar.apply(listaA), procesar.apply(listaB));
    }


    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(7, 2, 10, 3, 9);
        List<Integer> b = Arrays.asList(1, 4, 6, 8, 5, 2);
        System.out.println(fusionFinal(a, b));
    }
}