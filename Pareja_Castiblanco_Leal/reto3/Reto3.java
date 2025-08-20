package Pareja_Castiblanco_Leal.reto3;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {
    public static String repeatMessage(String message){
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> sb.append(message).append(" "));

        return sb.toString().trim();
    }
    public static String invertMessage(String message){
        StringBuffer sb = new StringBuffer(message);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String message = "DOSW is awesome";

        Function<String,String> fun1 = m-> repeatMessage(m);
        System.out.println(fun1.apply(message));
        Function<String, String> fun2 = m -> invertMessage(m);
        System.out.println(fun2.apply(message));
    }
}
