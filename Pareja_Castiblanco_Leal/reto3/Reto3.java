package Pareja_Castiblanco_Leal.reto3;

import java.util.function.Function;

public class Reto3 {
    public static String invertMessage(String message){
        StringBuffer sb = new StringBuffer(message);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String message = "DOSW is awesome";
        Function<String, String> fun = m -> invertMessage(m);
        System.out.println(fun.apply(message));
    }
}
