package Pareja_Castiblanco_Leal.reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CarreraParalela {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < rand.nextInt(1, 50); i++) {
            numberList.add(rand.nextInt(1, 50));
        }

        System.out.println("La lista es: " + numberList);

        Optional<Integer> maxNum = numberList.stream().max(Integer::compareTo);
        System.out.println("El número más grande es: " + maxNum.get());

        Optional<Integer> minNum = numberList.stream().min(Integer::compareTo);
        Integer length = numberList.size();
        System.out.println("El número más pequeño es: " + minNum.get() + " y la longitud de lista es: " + length);

        String mensajeMax = (maxNum.get() % 2 == 0)
                ? "El número mayor es múltiplo de 2"
                : "El número mayor no es múltiplo de 2";
        System.out.println(mensajeMax);
        String mensajeMin = (minNum.get() % 2 == 0 && minNum.get() > 0)
                ? "El número menor es divisor de 2"
                : "El número menor no es divisor de 2";
        System.out.println(mensajeMin);
        String mensaje2 = (length % 2 == 0)
                ? "La longitud de la lista es par"
                : "La longitud de la lista es impar";
        System.out.println(mensaje2);
    }
}
