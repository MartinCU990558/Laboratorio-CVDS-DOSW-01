package reto5;
import java.util.*;
import java.util.stream.*;


public class Reto5{

    static HashSet<Integer> ceroTres(HashSet<Integer> numeros){
        return numeros.stream().filter(x -> x % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static TreeSet<Integer> ordenNatural(TreeSet<Integer> arbol) {
        return arbol.stream()
            .filter(num -> num % 5 != 0)
            .collect(Collectors.toCollection(TreeSet::new));
    }

    static TreeSet<Integer> unificacion(HashSet<Integer> hash, TreeSet<Integer> tree){
        TreeSet<Integer> numerosUnidos = Stream.concat(hash.stream(), tree.stream())
            .collect(Collectors.toCollection(TreeSet::new));
        return numerosUnidos;

    }

    public static void main(String[] args) {

        Random random = new Random();
        TreeSet<Integer> numerosTree = new TreeSet<>();
        HashSet<Integer> numerosHash = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int num = random.nextInt(100);
            numerosTree.add(num);
        }

        for(int i = 0; i < 10; i++){
            int num = random.nextInt(100);
            numerosHash.add(num);
        }

        TreeSet<Integer> numeros = ordenNatural(numerosTree);
        HashSet<Integer> numeros1 = ceroTres(numerosHash);

        System.out.println(numeros);
        System.err.println(numeros1);

        TreeSet<Integer> numerosUnidos = unificacion(numeros1, numeros);
        numerosUnidos.forEach(n -> System.out.println("Número en arena: " + n));
 
    }

}
