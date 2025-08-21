import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Hashtable;
import java.util.stream.Stream;

public class Reto4 {

        public static HashMap<String, Integer> almacen(List<Map.Entry<String, Integer>> numbers) {
                HashMap<String, Integer> mapa = numbers.stream()
                                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue(), (y, nuevo) -> y,
                                                HashMap::new));
                return mapa;
        }

        public static Hashtable<String, Integer> almacenSeguro(List<Map.Entry<String, Integer>> numbers) {
                Hashtable<String, Integer> mapa = numbers.stream()
                                .collect(Collectors.toMap(
                                                k -> k.getKey(),
                                                v -> v.getValue(),
                                                (y, nuevo) -> y,
                                                Hashtable::new));
                return mapa;
        }

        public static HashMap<String, Integer> almacenTodo(List<Map.Entry<String, Integer>> numbers,
                        List<Map.Entry<String, Integer>> numbersTwo) {
                HashMap<String, Integer> unificacion = Stream
                                .concat(numbers.stream(), numbersTwo.stream())
                                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
                                                (y, nuevo) -> y,
                                                HashMap::new));

                return unificacion;
        }

        public static HashMap<String, Integer> mayusculasClaves(HashMap<String, Integer> numbers) {
                HashMap<String, Integer> mayusculas = numbers.entrySet().stream()
                                .collect(Collectors.toMap(
                                                entry -> entry.getKey().toUpperCase(), entry -> entry.getValue(),
                                                (v1, v2) -> v1,
                                                HashMap::new));

                return mayusculas;
        }

        public static void ordenado(HashMap<String, Integer> mapa) {
                mapa.entrySet().stream()
                                .sorted(Map.Entry.comparingByKey())
                                .forEach(System.out::println);
        }

        public static void combinacion(HashMap<String, Integer> numbers,
                        Hashtable<String, Integer> numbersTwo) {
                HashMap<String, Integer> unificacion = Stream
                                .concat(numbers.entrySet().stream(), numbersTwo.entrySet().stream())
                                .sorted(Map.Entry.comparingByKey())
                                .collect(Collectors.toMap(entry -> entry.getKey().toUpperCase(),
                                                entry -> entry.getValue(),
                                                (y, nuevo) -> y, HashMap::new));

                unificacion.entrySet().stream().forEach(System.out::println);
        }

        public static void main(String args[]) {
                List<Map.Entry<String, Integer>> numbers = List.of(
                                new AbstractMap.SimpleEntry<>("uno", 1),
                                new AbstractMap.SimpleEntry<>("dos", 2),
                                new AbstractMap.SimpleEntry<>("tres", 3));

                List<Map.Entry<String, Integer>> numbersTwo = List.of(
                                new AbstractMap.SimpleEntry<>("cuatro", 4),
                                new AbstractMap.SimpleEntry<>("cinco", 5),
                                new AbstractMap.SimpleEntry<>("seis", 6));

                System.out.println(almacen(numbers));
                System.out.println(almacenSeguro(numbers));
                System.out.println(almacenTodo(numbers, numbersTwo));

                System.out.println(mayusculasClaves(almacenTodo(numbers, numbersTwo)));
                ordenado(almacenTodo(numbers, numbersTwo));

                HashMap<String, Integer> prueba = new HashMap<>();
                prueba.put("oro", 5);
                prueba.put("plata", 3);
                prueba.put("oro", 7);
                prueba.put("diamante", 10);
                Hashtable<String, Integer> prueba2 = new Hashtable<>();
                prueba2.put("plata", 8);
                prueba2.put("rubi", 4);
                prueba2.put("oro", 12);
                prueba2.put("esmeralda", 6);

                combinacion(prueba, prueba2);

        }

}