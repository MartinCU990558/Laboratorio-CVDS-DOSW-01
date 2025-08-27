package Pareja_Ramirez_Guzman.Reto2_RamirezGuzman;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        NumberClassifier classifier = new NumberClassifier(
                Arrays.asList(
                        22, 17, 10, 47, 7, 4, 14, 10, 12, 66, 11, 54, 30, 63, 75, 70
                ));

        NumberClassifier classifier2 = new NumberClassifier(
                Arrays.asList(
                        124, 781, 9, 45, 2, 698, 542, 17, 55, 904, 507, 727, 11, 13
                )
        );

        Stream.of("- Lista Classifier #1: ",
                        "Máximo: " + classifier.maxNumber(), "Mínimo: " + classifier.minNumber(),
                        "Cantidad: " + classifier.quantityOfNumbers(),
                        "Máximo par: " + classifier.isMaxEven(), "Máximo divisor de 2: " + classifier.isMaxATwoDivisor(),
                        "La cantidad de elementos es par: " + classifier.isQuantityEven())
                .forEach(System.out::println);

        Stream.of("- Lista Classifier #2: ",
                        "Máximo: " + classifier2.maxNumber(), "Mínimo: " + classifier2.minNumber(),
                        "Cantidad: " + classifier.quantityOfNumbers(),
                        "Máximo par: " + classifier2.isMaxEven(), "Máximo divisor de 2: " + classifier2.isMaxATwoDivisor(),
                        "La cantidad de elementos es par: " + classifier.isQuantityEven())
                .forEach(System.out::println);
    }
}

