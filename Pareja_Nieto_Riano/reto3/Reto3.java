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
        String repetido = repeticion(message).toString();
        String resultado = invertir(repetido).toString();
        System.out.println(resultado);
    }

    public static void main(String args[]) {
        System.out.println(repeticion("hola"));
        System.out.println(invertir("hola"));
        combinacion("hola");
    }
}