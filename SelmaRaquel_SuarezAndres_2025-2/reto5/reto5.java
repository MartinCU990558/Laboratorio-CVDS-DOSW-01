package SelmaRquel_SuarezAndres_2025.reto5;



import java.util.*;
import java.util.stream.Collectors;

public class reto5 {

    public static Set<Integer> hashSetSinMultiplosDe3(Collection<Integer> nums) {
        return nums.stream().filter(n -> n % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> treeSetSinMultiplosDe5(Collection<Integer> nums) {
        return nums.stream().filter(n -> n % 5 != 0).collect(Collectors.toCollection(TreeSet::new));
    }

    public static SortedSet<Integer> unirOrdenado(Set<Integer> a, Set<Integer> b) {
        SortedSet<Integer> res = new TreeSet<>();
        res.addAll(a);
        res.addAll(b);
        return res;
     }


    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(4,9,15,7,18,21,10,5));
        Set<Integer> B = new TreeSet<>(Arrays.asList(12,3,25,10,7,30,18,4));

        var aFil = hashSetSinMultiplosDe3(A);
        var bFil = treeSetSinMultiplosDe5(B);
        var union = unirOrdenado(aFil, bFil);

        union.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
