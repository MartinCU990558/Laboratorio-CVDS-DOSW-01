package reto5;
import java.util.HashSet;
import java.util.TreeSet;
public class Reto5 {

    public static void main(String[] args) {
        HashSet<Integer> hash = SetBattle.generateHashSet();
        TreeSet<Integer> tree = SetBattle.generateTreeSet();
        TreeSet<Integer> unify = SetBattle.unifySets(hash, tree);
        unify.stream()
                .forEach(e -> System.out.println("Número en arena: " + e));

    }
}