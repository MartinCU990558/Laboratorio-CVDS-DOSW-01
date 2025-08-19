import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {
    public static void main(String[] args) {
     Random random = new Random();
        List<Integer> numerosAleatorios1 = Stream
                .generate(() -> random.nextInt(50))
                .limit(10)
                .toList();
        List<Integer> numerosAleatorios2 = Stream
                .generate(() -> random.nextInt(50))
                .limit(10)
                .toList();

        List<Integer> hashSet = numerosAleatorios1.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("HashSet:"+numerosAleatorios1 +" -> "+ hashSet);

        List<Integer> treeSet = numerosAleatorios2.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("TreeSet:"+ numerosAleatorios2+ " -> " + treeSet);
        List<Integer> Union = Stream.concat(hashSet.stream(), treeSet.stream())
                .distinct()
                .sorted()
                .toList();
        System.out.println("Union:" + Union);
        Union.forEach(Elemento -> System.out.println("Número en arena: " + Elemento));
    }
}