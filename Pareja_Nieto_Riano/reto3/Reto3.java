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

    public static void main(String args[]) {
        System.out.println(repeticion("hola"));
    }
}