import java.util.List;
import java.util.Arrays;

public class CaarreraParalela {

    static int biggerNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }

    static int minimumNumber(List<Integer> numbers) {
        return numbers.stream().min(Integer::compare).get();
    }

    static Long amount(List<Integer> numbers) {
        return numbers.stream().count();
    }

    static GeneralObject fusion(List<Integer> numbers) {
        GeneralObject object = new GeneralObject(minimumNumber(numbers), biggerNumber(numbers), amount(numbers));
        int maximum = object.getMax();
        boolean multipleOfTwo = maximum % 2 == 0 ? true : false;
        boolean divOfTwo = 2 % maximum == 0 ? true : false;
        Long amount = object.getAmount();
        boolean even = amount % 2 == 0 ? true : false;
        return object;
    }

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(11, 8, 9, 15, 39, 1, 4, 83);
        System.out.println(biggerNumber(numbers));
        System.out.println(minimumNumber(numbers));
        System.out.println(amount(numbers));
        System.out.println(fusion(numbers));
    }
}
