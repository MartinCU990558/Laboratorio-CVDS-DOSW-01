package Pareja_Castiblanco_Leal.Reto5;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Reto5 {
    public static Set<Integer> generarGuerreros(){
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
        Set<Integer> guerreros = generarGuerreros();
        System.out.println(guerreros);
    }
}