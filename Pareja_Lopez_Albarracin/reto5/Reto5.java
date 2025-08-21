package Pareja_Lopez_Albarracin.reto5;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.*;


public  class Reto5{
    public static void main(String args[]){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(9);
        hashSet.add(15);
        hashSet.add(7);
        hashSet.add(18);
        hashSet.add(21);
        hashSet.add(10);
        hashSet.add(5);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(3);
        treeSet.add(25);
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(30);
        treeSet.add(18);
        treeSet.add(4);

        HashSet<Integer> hashFiltered = deleteMultiples(hashSet);
        System.out.println("HashSet sin múltiplos de 3: " + hashFiltered);

        TreeSet<Integer> treeFiltered = deleteMultiplesFive(treeSet);
        System.out.println("TreeSet sin múltiplos de 5: " + treeFiltered);

        System.out.print("Unión:\n");
        unification(hashFiltered, treeFiltered);

    }

    public static TreeSet<Integer> deleteMultiplesFive(TreeSet<Integer> numbers){
        return numbers.stream().filter(x-> x % 5!=0).collect(Collectors.toCollection(TreeSet::new));
    }
    public static HashSet<Integer> deleteMultiples(HashSet<Integer> numbers){
        return numbers.stream().filter(x-> x%3!= 0).collect(Collectors.toCollection(HashSet::new));

    } 

    public static void unification(HashSet<Integer> number1, TreeSet<Integer> number2) {
        TreeSet<Integer> finalSet = Stream
                .concat(number1.stream(), number2.stream()).sorted().distinct()
                .collect(Collectors.toCollection(TreeSet::new));
                finalSet.stream().forEach(System.out::println);
    }

    
}