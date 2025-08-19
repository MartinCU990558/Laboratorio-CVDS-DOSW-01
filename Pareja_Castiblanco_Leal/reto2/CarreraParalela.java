package Pareja_Castiblanco_Leal.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CarreraParalela {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            numberList.add(rand.nextInt(50));
        }
        System.out.println("La lista es: "+numberList);

        Optional<Integer> minNum = numberList.stream().min((a, b) -> a.compareTo(b));
        Integer length = numberList.size();
        System.out.println("El número más pequeño es: "+minNum.get()+" y la longitud de lista es: "+length);
    }
}