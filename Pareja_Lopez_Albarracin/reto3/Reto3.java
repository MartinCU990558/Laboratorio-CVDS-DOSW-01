package Pareja_Lopez_Albarracin.reto3;
import java.util.stream.IntStream;
public class Reto3{
    public static void main(String[] args){

        System.out.println(reverseString("Eco"));
        System.out.println(repeatString("Eco"));
    }

    public static StringBuffer reverseString(String message){
        return new StringBuffer(message).reverse();
    }

    public static StringBuilder repeatString(String message){
        StringBuilder messageToRepeat = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (i > 0) messageToRepeat.append("");
            messageToRepeat.append(message);
        });
        return messageToRepeat;
    }

    public void combination(String message){

    }
}