import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    public static int maximo(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null);

    static Function<List<Integer>, Integer>  getSize = list -> list.size();

    

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 17, 2, 9, 25);
        int max = maximo(numbers);
        int min = getMin.apply(numbers);
        int size = getSize.apply(numbers);

        Resultados res = new Resultados(max, min, size);

        System.out.println("Maximum nnumber: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Size of numbers: " + size);
    }
}


