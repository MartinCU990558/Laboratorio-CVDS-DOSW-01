package Pareja_DuarteNicolas_RangelJuan.reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reto5 {
    HashSet<Integer> numOrdenados = new HashSet<>();
    TreeSet<Integer> numNoOrdenados = new TreeSet<>();

    public Reto5() {
    }
    public void limpiar(){
        numOrdenados = numOrdenados.stream().filter(num -> num % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
        numNoOrdenados = numNoOrdenados.stream().filter(num -> num % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
        pegar();
    }
    public void pegar(){
        Set<Integer> union = Stream.concat(numOrdenados.stream(), numNoOrdenados.stream()).collect(Collectors.toSet());
        union.forEach(n -> System.out.println(n));
    }
    public static void main (String[] arg){
        Reto5 reto5 = new Reto5();
        HashSet<Integer> numOrdenados = reto5.numOrdenados;
        TreeSet<Integer> numNoOrdenados = reto5.numNoOrdenados;
        IntStream.rangeClosed(1, 10).forEach(numOrdenados::add);
        IntStream.rangeClosed(11, 20).forEach(numNoOrdenados::add);
        reto5.limpiar();
    }
}
