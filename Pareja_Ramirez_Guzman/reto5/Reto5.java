import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Reto5 {

    public static Set<Integer> generarTreeSet() {
        Random random = new Random();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt(30) + 1);
        }

        return treeSet.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        Set<Integer> treeSet = generarTreeSet();
        treeSet.forEach(n -> System.out.println("Número en TreeSet: " + n));
    }
}
