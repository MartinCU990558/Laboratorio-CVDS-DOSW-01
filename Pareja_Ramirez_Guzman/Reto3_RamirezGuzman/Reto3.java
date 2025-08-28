package Pareja_Ramirez_Guzman.Reto3_RamirezGuzman;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reto3 {

    public static String ecoConBuilder(String mensaje) {
        String resultado = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));
        StringBuilder sb = new StringBuilder();
        sb.append(resultado);
        return sb.toString();
    }

    public static String ecoBuffer(String mensaje) {
        StringBuilder sb = new StringBuilder(mensaje);
        return sb.reverse().toString();
    }

    public static String ecoMisterioso(String mensaje) {
        Function<String, String> repetirTresVeces = msg ->
                IntStream.range(0, 3)
                        .mapToObj(i -> msg)
                        .collect(Collectors.joining(" "));
        String repetido = repetirTresVeces.apply(mensaje);
        StringBuilder sb = new StringBuilder(repetido);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Function<String, String> funcionBuilder = Reto3::ecoConBuilder;
        System.out.println("Eco con Builder: " + funcionBuilder.apply("Soy el reto 3"));

        Function<String, String> ecoConBuffer = Reto3::ecoBuffer;
        System.out.println("Eco Buffer: " + ecoConBuffer.apply("Soy el reto 3"));

        Function<String, String> ecoFinal = Reto3::ecoMisterioso;
        System.out.println("Eco Misterioso: " + ecoFinal.apply("Soy el reto 3"));
    }
}
