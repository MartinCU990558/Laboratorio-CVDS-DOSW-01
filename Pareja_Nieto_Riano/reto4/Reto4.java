import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Hashtable;

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
                        (y, nuevo) -> y, // conserva el primero
                        Hashtable::new));
        return mapa;
    }

    public static void main(String args[]) {
        List<Map.Entry<String, Integer>> numbers = List.of(
                new AbstractMap.SimpleEntry<>("uno", 1),
                new AbstractMap.SimpleEntry<>("dos", 2),
                new AbstractMap.SimpleEntry<>("tres", 3));

        System.out.println(almacen(numbers));
        System.out.println(almacenSeguro(numbers));

    }
}