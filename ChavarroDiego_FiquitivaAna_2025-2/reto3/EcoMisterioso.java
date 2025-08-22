import java.util.Objects;

public class EcoMisterioso {
    public static String ecoMisterioso(String mensaje) {
        Objects.requireNonNull(mensaje, "mensaje no puede ser null");
        return new StringBuffer(mensaje).reverse().toString();
    }

    @FunctionalInterface
    public interface Eco { String aplicar(String msg); }

    public static void main(String[] args) {
        Eco eco = EcoMisterioso::ecoMisterioso;
        System.out.println(eco.aplicar("hola"));
    }
}
