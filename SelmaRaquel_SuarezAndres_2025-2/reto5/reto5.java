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
}