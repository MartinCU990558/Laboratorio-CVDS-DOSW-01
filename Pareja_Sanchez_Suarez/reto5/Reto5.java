import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {
    public static void main(String[] args) {
     Random random = new Random();
        List<Integer> numerosAleatorios = Stream
                .generate(() -> random.nextInt(50))
                .limit(10)
                .toList();

        List<Integer> hashSet = numerosAleatorios.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("HashSet:" + hashSet);
    }
}