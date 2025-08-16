import java.util.List;

public class CarreraParalela {

    public static int maximo(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 17, 2, 9, 25);
        int mayor = maximo(numeros);
        System.out.println("El número máximo es: " + mayor);
    }
}
