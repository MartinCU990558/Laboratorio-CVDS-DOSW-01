package SelmaRquel_SuarezAndres_2025.reto3;
import java.util.function.Function;
import java.util.stream.IntStream;

public class reto3 {


    public static String repetir3_Builder(String msg) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (i > 0) sb.append(' ');
            sb.append(msg);
        });
        return sb.toString();
    }

    public static String invertir_Buffer(String msg) {
        return new StringBuffer(msg).reverse().toString();

    }

    
    public static String ecoMisterioso(String msg) {

        Function<String,String> repetir3 = reto3::repetir3_Builder;
        Function<String,String> invertir = reto3::invertir_Buffer;

        return invertir.apply(repetir3.apply(msg));
    }

    public static void main(String[] args) {
        System.out.println(ecoMisterioso("hola"));

    }

}