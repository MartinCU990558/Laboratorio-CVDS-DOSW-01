import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {
    static StringBuilder repeticion(String message) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, 3).forEach(i -> {
            if (i > 0)
                sb.append(" ");
            sb.append(message);
        });

        return sb;
    }

    static StringBuffer invertir(String message) {
        StringBuffer sbf = new StringBuffer(message);
        return sbf.reverse();
    }

    static void combinacion(String message) {
        Function<String, StringBuilder> sb = (x) -> Reto3.repeticion(x);
        String s = sb.apply(message).toString();
        System.out.println(s);
        Function<String, StringBuffer> sbf = (x) -> Reto3.invertir(x);
        String invertido = sbf.apply(s).toString();
        System.out.println(invertido);
    }

    public static void main(String args[]) {
        System.out.println(repeticion("hola"));
        System.out.println(invertir("hola"));
        combinacion("Hola");
    }
}