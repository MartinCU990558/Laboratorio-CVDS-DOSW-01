import java.util.List;

public class CarreraParalela {
    public static int minimumNumber(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).get();
    }
}

