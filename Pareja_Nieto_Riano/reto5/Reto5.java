import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {

    static HashSet<Integer> multiplo(HashSet<Integer> lista) {
        return lista.stream().filter(x -> x % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    static TreeSet<Integer> multiplocinco(TreeSet<Integer> lista) {
        return lista.stream().filter(x -> x % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    static void choque(HashSet<Integer> lista, TreeSet<Integer> listaN) {
        TreeSet<Integer> unificacion = Stream
                .concat(lista.stream(), listaN.stream())
                .sorted()
                .distinct()
                .collect(Collectors.toCollection(TreeSet::new));
        unificacion.stream().forEach(System.out::println);
    }

    public static void main(String args[]) {
        Random random = new Random();
        HashSet<Integer> lista = new HashSet<>();
        TreeSet<Integer> listaT = new TreeSet<>();
        for (int i = 0; i < 8; i++) {
            int intRandom = random.nextInt(15);
            int treeRandom = random.nextInt(15);
            lista.add(intRandom);
            listaT.add(treeRandom);
        }
        System.out.println(multiplo(lista));
        System.out.println(multiplocinco(listaT));

        choque(lista, listaT);

    }
}
