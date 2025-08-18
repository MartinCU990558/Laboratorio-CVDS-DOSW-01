import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Random;



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

    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random num = new Random();

        for (int i = 0; i < 10; i++) {          
            treeSet.add(num.nextInt(50) + 1);  
        }

        TreeSet<Integer> streamTreeSet = randomNumbersTreeSet(treeSet);
        streamTreeSet.forEach(n -> System.out.println("Numbers that are not multiples of 5: " + n));

        
    }
}