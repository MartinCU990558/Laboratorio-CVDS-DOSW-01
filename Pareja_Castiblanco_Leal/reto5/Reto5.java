package Pareja_Castiblanco_Leal.reto5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Reto5 {
    public static Set<Integer> generarGuerreros(){
        Set<Integer> guerreros = new HashSet<>();
        Random random = new Random();
        for(int i = 0; i < random.nextInt(1,20); i++){
            guerreros.add(random.nextInt(100));
        }

        return guerreros.stream().filter(n -> n % 3 == 0).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Set<Integer> guerreros = generarGuerreros();
        System.out.println(guerreros);
    }
}