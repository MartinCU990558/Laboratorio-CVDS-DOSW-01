import java.util.List;
import java.util.Optional;

public class CarreraParalela {
    public static Integer maximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compareTo).orElse(null);
    }
}
