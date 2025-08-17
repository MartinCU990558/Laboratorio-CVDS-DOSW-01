
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;


public class Reto3{

    public static String ecoMisterious(String message){
        // Repetir 3 veces
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> sb.append(message).append(" "));
        String repeated = sb.toString().trim();

        // Invertir usando buffer
        StringBuffer buffer = new StringBuffer(repeated); 
        return buffer.reverse().toString();
    }



    public static void main(String[] args){
        String message = "Ciclos";
        Function<String, String> fun = msg -> Reto3.ecoMisterious(msg);

        String result = fun.apply(message);
        System.out.println("ecoMisterius merged: " + result);
    }
}