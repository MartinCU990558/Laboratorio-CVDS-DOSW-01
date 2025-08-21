package SelmaRquel_SuarezAndres_2025.reto3;
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

}