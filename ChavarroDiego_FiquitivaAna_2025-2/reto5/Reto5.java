

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {

    
    public static Set<Integer> crearHashSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 3 != 0) 
                .collect(Collectors.toCollection(HashSet::new));
    }

    // Estudiante B: TreeSet → elimina múltiplos de 5
    public static Set<Integer> crearTreeSet(List<Integer> numeros) {
        return numeros.stream()
                .filter(n -> n % 5 != 0) 
                .collect(Collectors.toCollection(TreeSet::new));
    }

  
    public static Set<Integer> unirColecciones(Set<Integer> hashSet, Set<Integer> treeSet) {
        return Stream.concat(hashSet.stream(), treeSet.stream())
                .collect(Collectors.toCollection(TreeSet::new));
    }

  
    public static void imprimirArena(Set<Integer> conjunto) {
        conjunto.forEach(n -> System.out.println("Número en arena: " + n));
    }

    
    public static void main(String[] args) {
        List<Integer> listaHashSet = Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
        List<Integer> listaTreeSet = Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

       
        Set<Integer> hashSet = crearHashSet(listaHashSet);
        Set<Integer> treeSet = crearTreeSet(listaTreeSet);

        
        Set<Integer> arenaFinal = unirColecciones(hashSet, treeSet);

      
        imprimirArena(arenaFinal);
    }
}
