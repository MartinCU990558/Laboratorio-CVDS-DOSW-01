import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CarreraParalela {

    public static int max(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).max().orElse(0); // Primer choque carril 1.
    }
    public static String maxWithTernary(List<Integer> lista) {
        int max = max(lista);
        return (max % 2 == 0) ? (max + " is a multiple of 2") : (max + " is not a multiple of 2"); // Segunda vuelta carril 1.
    }
    public static String evenSize(List<Integer> lista) {
        int size = getSize.apply(lista);
        return (size % 2 == 0) ? "The amount of data (" + size + ") es EVEN"
                               : "The amount of data (" + size + ") is NOT EVEN"; // Tercer choque carril 1.
    }

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null); // Primer choque carril 2.
    static Function<List<Integer>, Integer>  getSize = list -> list.size(); // Primer choque carril 2.

    // Segunda Vuelta Choque de Carriles - Comprobando si el numero maximo es divisor de 2.
    static Function<List<Integer>, Integer> getMax = list -> list.stream().max(Integer::compare).orElse(null);
    static Function<Integer, String> isDivisor = num -> (num % 2 == 0) ? "divisible" : "No divisible";

    // Tercer Choque de Carril 2 - Comprobando si el temaño de la lista es impar.
    static Function<Integer, String> isOdd = size -> (size % 2 != 0) ? "odd" : "even";

    //Lista de resultados
    public static class ListResults {
        public final int max;
        public final int min;
        public final int size;
        public final boolean maxIsMultipleOf2;
        public final boolean maxIsDivisorOf2;
        public final boolean sizeIsEven;
        public final boolean sizeIsOdd;

        /**
         * Contructor de las listas de resultados.
         * @param max
         * @param min
         * @param size
         * @param maxIsMultipleOf2
         * @param maxIsDivisorOf2
         * @param sizeIsEven
         * @param sizeIsOdd
         */
        public ListResults(int max, int min, int size, boolean maxIsMultipleOf2, boolean maxIsDivisorOf2, boolean sizeIsEven, boolean sizeIsOdd) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.maxIsMultipleOf2 = maxIsMultipleOf2;
            this.maxIsDivisorOf2 = maxIsDivisorOf2;
            this.sizeIsEven = sizeIsEven;
            this.sizeIsOdd = sizeIsOdd;
        }

        @Override
        public String toString() {
            return "ListResults{" +
                    "max=" + max +
                    ", min=" + min +
                    ", size=" + size +
                    ", maxIsMultipleOf2=" + maxIsMultipleOf2 +
                    ", maxIsDivisorOf2=" + maxIsDivisorOf2 +
                    ", sizeIsEven=" + sizeIsEven +
                    ", sizeIsOdd=" + sizeIsOdd +
                    '}';
        }
    }

    /**
     * Clase encargada de dar los resultados de las listas.
     */
    public static class Resultados {
        public final ListResults listA;
        public final ListResults listB;

        public Resultados(ListResults a, ListResults b) {
            this.listA = a;
            this.listB = b;
        }

        @Override
        public String toString() {
            return "Resultados:\n  Lista A -> " + listA + "\n  Lista B -> " + listB;
        }
    }

    /**
     * Combina los resultados.
     */
    public static Resultados resultado(List<Integer> listA, List<Integer> listB) {

        // Lista A
        int maxA = max(listA);                            
        Integer minAObj = getMin.apply(listA);             
        int minA = (minAObj == null) ? 0 : minAObj;
        int sizeA = getSize.apply(listA);
        boolean maxAMultiple = (maxA % 2 == 0);            
        boolean maxADivisor = (maxA != 0) ? (2 % maxA == 0) : false; 
        boolean sizeAEven = (sizeA % 2 == 0);
        boolean sizeAOdd = (sizeA % 2 != 0);
        ListResults resA = new ListResults(maxA, minA, sizeA, maxAMultiple, maxADivisor, sizeAEven, sizeAOdd);

        // Lista B
        int maxB = max(listB);
        Integer minBObj = getMin.apply(listB);
        int minB = (minBObj == null) ? 0 : minBObj;
        int sizeB = getSize.apply(listB);
        boolean maxBMultiple = (maxB % 2 == 0);
        boolean maxBDivisor = (maxB != 0) ? (2 % maxB == 0) : false;
        boolean sizeBEven = (sizeB % 2 == 0);
        boolean sizeBOdd = (sizeB % 2 != 0);
        ListResults resB = new ListResults(maxB, minB, sizeB, maxBMultiple, maxBDivisor, sizeBEven, sizeBOdd);

        return new Resultados(resA, resB);
    }

    static BiFunction<List<Integer>, List<Integer>, Resultados> resultsList = CarreraParalela::resultado;

    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 17, 2, 9, 25);
        List<Integer> list2 = List.of(7, 7, 6, 12);

       
        System.out.println("Carril1 - maxWithTernary: " + maxWithTernary(list1));
        System.out.println("Carril1 - evenSize: " + evenSize(list1));
        System.out.println("Carril2 - isDivisor(max of list1): " + isDivisor.apply(getMax.apply(list1)));
        System.out.println("Carril2 - isOdd(size of list1): " + isOdd.apply(getSize.apply(list1)));

        Resultados r1 = resultado(list1, list2);
        Resultados r2 = resultsList.apply(list1, list2);
        System.out.println(r1);
       
    }
}