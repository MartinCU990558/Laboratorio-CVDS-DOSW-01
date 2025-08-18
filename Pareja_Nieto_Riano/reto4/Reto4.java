import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Hashtable;
import java.util.stream.Stream;

public class Reto4 {

    public static HashMap<String, Integer> almacen(List<Map.Entry<String, Integer>> numbers) {
        HashMap<String, Integer> mapa = numbers.stream()
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue(), (y, nuevo) -> y, HashMap::new));
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
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (y, nuevo) -> y,
                        HashMap::new));

        return unificacion;
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
    }

}