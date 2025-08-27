package Pareja_Ramirez_Guzman.Reto1_RamirezGuzman;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Students> stList = Arrays.asList(
                new Students("Julián Ramírez", 20, "julian.ramirez-u@mail.escuelaing.edu.co", 6),
                new Students("Deisy Guzmán", 21, "deisy.guzman-c@mail.escuelaing.edu.co", 7)
        );

        List<Message> messages = IntStream.range(0, stList.size() / 2)
                .mapToObj(i -> new Message(stList.get(i * 2), stList.get(i * 2 + 1)))
                .collect(Collectors.toList());

        messages.forEach(System.out::println);
    }
}
