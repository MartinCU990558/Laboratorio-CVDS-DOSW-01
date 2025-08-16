import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null);

    static Function<List<Integer>, Integer>  getSize = list -> list.size();

    public static void main(String[] args) {
    List<Integer> numbers = List.of(3, 17, 2, 9, 25);
    Integer min = getMin.apply(numbers);
    Integer size = getSize.apply(numbers);
    System.out.println("List: " + numbers);
    System.out.println("Minimum number: " + min);
    System.out.println("Size of numbers: " + size);
    }
} 