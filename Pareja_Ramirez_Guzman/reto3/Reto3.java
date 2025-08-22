import java.util.function.Function;
import java.util.stream.IntStream;

public class Reto3 {

    public static String ecoBuffer(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }

    public static String ecoMisterioso(String mensaje) {
        Function<String, String> repetirTresVeces = msg ->
                IntStream.range(0, 3)
                        .mapToObj(i -> msg)
                        .reduce((a, b) -> a + " " + b)
                        .get();

        String repetido = repetirTresVeces.apply(mensaje);


        StringBuffer sb = new StringBuffer(repetido);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Function<String, String> ecoConBuffer = Reto3::ecoBuffer;

        System.out.println("Eco Buffer: " + ecoConBuffer.apply("Soy el reto 3"));

        Function<String, String> ecoFinal = Reto3::ecoMisterioso;

        System.out.println("Eco Misterioso: " + ecoFinal.apply("Soy el reto 3"));
    }
}

