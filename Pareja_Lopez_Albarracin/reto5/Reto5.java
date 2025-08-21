package Pareja_Lopez_Albarracin.reto5;

import java.util.HashSet;
import java.util.stream.*;
public  class Reto5{
    public static void main(String args[]){

    }

    public static HashSet<Integer> deleteMultiples(HashSet<Integer> numbers){
        return numbers.stream().filter(x-> x%3!= 0).collect(Collectors.toCollection(HashSet::new));

    } 

}