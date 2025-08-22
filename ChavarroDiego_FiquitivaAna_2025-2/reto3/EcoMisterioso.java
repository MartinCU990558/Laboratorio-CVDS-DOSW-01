import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class EcoMisterioso {
    public static final int REPETICIONES = 3;

    public static String ecoMisterioso(String mensaje) {
        Objects.requireNonNull(mensaje, "mensaje no puede ser null");
        return IntStream.range(0, REPETICIONES)
                .mapToObj(i -> mensaje)
                .collect(Collector.of(
                        StringBuilder::new,
                        (sb, s) -> { if (sb.length() > 0) sb.append(' '); sb.append(s); },
                        (sb1, sb2) -> { if (sb1.length() > 0 && sb2.length() > 0) sb1.append(' '); return sb1.append(sb2); },
                        StringBuilder::toString
                ));
    }

    @FunctionalInterface
    public interface Eco { String aplicar(String msg); }

    public static void main(String[] args) {
        Eco eco = EcoMisterioso::ecoMisterioso;
        System.out.println(eco.aplicar("hola"));
    }
}
