package Pareja_Castiblanco_Leal.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CarreraParalela {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < rand.nextInt(1, 50); i++){
            numberList.add(rand.nextInt(1, 50));
        }
        System.out.println("La lista es: " + numberList);

        Optional<Integer> maxNum = numberList.stream().max((a, b) -> a.compareTo(b));

        System.out.println("El número más grande es: " + maxNum.get());

        Optional<Integer> minNum = numberList.stream().min((a, b) -> a.compareTo(b));
        Integer length = numberList.size();
        System.out.println("El número más pequeño es: " + minNum.get() + " y la longitud de lista es: " + length);

        String mensaje = (maxNum.get() % 2 == 0) ? "El número mayor es múltiplo de 2" : "El número mayor no es múltiplo de 2";
        System.out.println(mensaje);

        String mensaje2 = (numberList.size() % 2 == 0)? "La longitud de la lista es par" : "La longitud de la lista es impar";
        System.out.println(mensaje2);
    }
}
