import java.util.stream.*;
public class Reto3 {

    public static String ecoConBuilder(String mensaje) {
        String resultado = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        StringBuilder sb = new StringBuilder();
        sb.append(resultado);

        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.function.Function<String, String> funcionBuilder = Reto3::ecoConBuilder;

        String mensaje = "Soy el tercer reto";
        System.out.println("Eco con Builder: " + funcionBuilder.apply(mensaje));
    }
}

