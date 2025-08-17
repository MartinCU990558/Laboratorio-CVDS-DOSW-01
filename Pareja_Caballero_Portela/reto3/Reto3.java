
import java.util.List;
import java.util.stream.IntStream;


public class Reto3{

    public static String ecoMisterious(String message){
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> sb.append(message).append(" "));
        return sb.toString().trim();
    }



    public static void main(String[] args){
        String message = "Ciclos";
        System.out.println("Eco Misterious Contenated: " + ecoMisterious(message));

    }
}