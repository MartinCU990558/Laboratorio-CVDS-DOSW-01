package Pareja_Lopez_Albarracin.reto5;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.*;
public  class Reto5{
    public static void main(String args[]){

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