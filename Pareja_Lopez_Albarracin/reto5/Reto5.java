package Pareja_Lopez_Albarracin.reto5;
import java.util.TreeSet;
import java.util.stream.*;
import java.util.HashSet;

public  class Reto5{
    public static void main(String args[]){

    }

    public static TreeSet<Integer> deleteMultiplesFive(TreeSet<Integer> numbers){
        return numbers.stream().filter(x-> x % 5!=0).collect(Collectors.toCollection(TreeSet::new));
    }
    public static HashSet<Integer> deleteMultiples(HashSet<Integer> numbers){
        return numbers.stream().filter(x-> x%3!= 0).collect(Collectors.toCollection(HashSet::new));

    } 

    

}