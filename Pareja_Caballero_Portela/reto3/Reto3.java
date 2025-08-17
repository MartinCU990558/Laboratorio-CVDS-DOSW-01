import java.util.function.Function;
public class Reto3{

    public static String ecoMisterious(String message){
        StringBuffer buffer = new StringBuffer(message); // Invertir usando buffer
        return buffer.reverse().toString();
    }

    public static void main (String[] args){

        Function<String, String> fun = msg -> Reto3.ecoMisterious(msg);
        
        String message = "Ciclos";
        String result = fun.apply(message);
        System.out.println("Reverse message: " + result);
    }
}