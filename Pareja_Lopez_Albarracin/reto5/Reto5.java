package Pareja_Lopez_Albarracin.reto5;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.stream.*;
public class Reto5{
    public static void main(String[] args) {
        
    }

    public static TreeSet<Integer> deleteMultiplesFive(TreeSet<Integer> numbers){
        return numbers.stream().filter(x-> x % 5!=0).collect(Collectors.toCollection(TreeSet::new));
    }

    public static void unification(HashSet<Integer> numbers1,TreeSet<Integer> numbers2){

    }
}