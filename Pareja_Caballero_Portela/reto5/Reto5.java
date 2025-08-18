import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Reto5 {

    /**
     * Método que permite almacenar números aleatorios en orden ascendente y elimine los múltiplos de 5.
     * @param numbers
     * @return
     */
    public static TreeSet<Integer> randomNumbersTreeSet(TreeSet<Integer> numbers){
        return numbers.stream()
            .filter(n -> n % 5 != 0)
            .collect(Collectors.toCollection(TreeSet::new)); // TreeSet elementos en orden ascendente y elimina duplicados.
    }

    /**
     * Método que permite almacenar números aleatorios sin orden y elimine los múltiplos de 3.
     * @param numbers
     * @return
     */
    public static HashSet<Integer> randomNumbersHashSet(HashSet<Integer> numbers){
        return numbers.stream()
            .filter(n -> n % 3 != 0)
            .collect(Collectors.toCollection(HashSet::new));
    }

    /**
     * Método que Une las colecciones.
     * @param tree
     * @param hash
     * @return
     */
    public static TreeSet<Integer> union(Set<Integer> tree, Set<Integer> hash){
        TreeSet<Integer> unionSets = new TreeSet<>();
        unionSets.addAll(tree);
        unionSets.addAll(hash);
        return unionSets;
    }
    
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random num = new Random();
        for (int i = 0; i < 10; i++) treeSet.add(num.nextInt(50) + 1);  

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) hashSet.add(num.nextInt(50) + 1);

        // Ejemplo de entrada.
        TreeSet<Integer> treeSetExample = new TreeSet<>(Arrays.asList(12,3,25,10,7,30,18,4));
        HashSet<Integer> hashSetExample = new HashSet<>(Arrays.asList(4,9,15,7,18,21,10,5));
        TreeSet<Integer> streamTreeSetExample = randomNumbersTreeSet(treeSetExample);
        HashSet<Integer> streamHashSetExample = randomNumbersHashSet(hashSetExample);
        TreeSet<Integer> exampleInput = union(streamTreeSetExample, streamHashSetExample );
        exampleInput.forEach(n -> System.out.println("Número en arena: " + n));
        
        // Ejemplo con números aleatorios 
        TreeSet<Integer> streamTreeSet = randomNumbersTreeSet(treeSet);
        HashSet<Integer> streamHashSet = randomNumbersHashSet(hashSet); 
        TreeSet<Integer> unionWithRandomNumbers = union(streamTreeSet, streamHashSet);
        streamHashSet.forEach(n -> System.out.println("Numbers that are not multiples of 3: " + n));
        streamTreeSet.forEach(n -> System.out.println("Numbers that are not multiples of 5: " + n));
        unionWithRandomNumbers.forEach(n -> System.out.println("Numero en arena(con numeros aleatorios): " + n));

    }
}
