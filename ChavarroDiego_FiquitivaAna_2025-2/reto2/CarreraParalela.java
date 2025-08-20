import java.util.List;

public class CarreraParalela {
    public static String minimoYCantidad(List<Integer> numeros) {
        Integer min = numeros.stream().min(Integer::compareTo).orElse(null);
        int count = numeros.size();
        return "Min: " + min + ", Cantidad: " + count;
    }
}
