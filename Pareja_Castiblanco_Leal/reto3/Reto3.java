package Pareja_Castiblanco_Leal.reto3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {
    public static String repeatMessage(String message){
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> sb.append(message).append(" "));

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String message = "DOSW is awesome";
        Function<String, String> fun = m -> repeatMessage(m);
        System.out.println(fun.apply(message));
    }
}