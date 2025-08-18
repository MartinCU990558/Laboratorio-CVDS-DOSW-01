import java.util.List;
import java.util.Arrays;

public class CaarreraParalela {

    static int biggerNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(11, 8, 9, 15, 39, 1, 4, 83);
        System.out.println(biggerNumber(numbers));
    }
}
