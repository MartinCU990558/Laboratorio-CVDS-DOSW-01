package reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class CarreraParalela {
    public static void main(String[] args) {

        List<Integer> numberList1 = new ArrayList<>();
        List<Integer> numberList2 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < rand.nextInt(1, 50); i++) {
            numberList1.add(rand.nextInt(1, 50));
        }

        for (int i = 0; i < rand.nextInt(1, 50); i++) {
            numberList2.add(rand.nextInt(1, 50));
        }


        System.out.println("Lista 1: " + numberList1);
        System.out.println("Lista 2: " + numberList2);

        Optional<Integer> maxNum1 = numberList1.stream().max(Integer::compareTo);
        Optional<Integer> minNum1 = numberList1.stream().min(Integer::compareTo);
        Integer length1 = numberList1.size();

        Optional<Integer> maxNum2 = numberList2.stream().max(Integer::compareTo);
        Optional<Integer> minNum2 = numberList2.stream().min(Integer::compareTo);
        Integer length2 = numberList2.size();


        System.out.println("Resultados Lista 1:");
        System.out.println("Número mayor: " + maxNum1.get());
        System.out.println("Número menor: " + minNum1.get());
        System.out.println("Cantidad de elementos: " + length1);


        String mensajeMax1 = (maxNum1.get() % 2 == 0) ? "El número mayor es múltiplo de 2" : "El número mayor no es múltiplo de 2";
        System.out.println(mensajeMax1);
        String mensajeMin1 = (minNum1.get() % 2 == 0 && minNum1.get() > 0) ? "El número menor es divisor de 2" : "El número menor no es divisor de 2";
        System.out.println(mensajeMin1);


        String mensajeLength1 = (length1 % 2 == 0) ? "La longitud de la lista 1 es par" : "La longitud de la lista 1 es impar";
        System.out.println(mensajeLength1);

        System.out.println("\nResultados Lista 2:");
        System.out.println("Número mayor: " + maxNum2.get());
        System.out.println("Número menor: " + minNum2.get());
        System.out.println("Cantidad de elementos: " + length2);


        String mensajeMax2 = (maxNum2.get() % 2 == 0) ? "El número mayor es múltiplo de 2" : "El número mayor no es múltiplo de 2";
        System.out.println(mensajeMax2);
        String mensajeMin2 = (minNum2.get() % 2 == 0 && minNum2.get() > 0) ? "El número menor es divisor de 2" : "El número menor no es divisor de 2";
        System.out.println(mensajeMin2);


        String mensajeLength2 = (length2 % 2 == 0) ? "La longitud de la lista 2 es par" : "La longitud de la lista 2 es impar";
        System.out.println(mensajeLength2);
    }
}

