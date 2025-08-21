package reto5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class Reto5 {
    public static Set<Integer> generarGuerrerosHash(){
        Set<Integer> guerreros = new HashSet<>();
        Random random = new Random();
        for(int i = 0; i < random.nextInt(1,20); i++){
            guerreros.add(random.nextInt(100));
        }

        return guerreros.stream().filter(n -> n % 3 != 0).collect(Collectors.toSet());
    }
    public static Set<Integer> generarGuerrerosTree(){
        Set<Integer> guerreros = new TreeSet<>();
        Random random = new Random();
        for(int i = 0; i < random.nextInt(1,20); i++){
            int numero = random.nextInt(100);
            if(numero % 5 != 0){
                guerreros.add(numero);
            }
        }
        return guerreros;
    }
    public static void main(String[] args) {
        Set<Integer> guerrerosHash = generarGuerrerosHash();
        Set<Integer> guerrerosTree = generarGuerrerosTree();

        Set<Integer> batalla = new TreeSet<>();
        batalla.addAll(guerrerosHash);
        batalla.addAll(guerrerosTree);

        System.out.println("Guerreros Hash:");
        guerrerosHash.forEach(n -> System.out.print(n + " "));

        System.out.println("\n Guerreros Tree:");
        guerrerosTree.forEach(n -> System.out.print(n + " "));

        System.out.println("\n Batalla :");
        batalla.forEach(n -> System.out.print(n + " "));
    }
}