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
        boolean odd = amount % 2 != 0 ? true : false;
        return object;
    }

    static Resultados fusionar(List<Integer> numbers, List<Integer> numbersTwo) {
        int maximum = biggerNumber(numbers) > biggerNumber(numbersTwo) ? biggerNumber(numbers)
                : biggerNumber(numbersTwo);
        int minimum = minimumNumber(numbers) > minimumNumber(numbersTwo) ? biggerNumber(numbersTwo)
                : biggerNumber(numbers);
        Long amountNumbers = amount(numbers);
        Long amountNumbersTwo = amount(numbersTwo);
        boolean multipleOfTwo = maximum % 2 == 0 ? true : false;
        boolean divOfTwo = 2 % maximum == 0 ? true : false;
        boolean even = amountNumbers % 2 == 0 ? true : false;
        boolean eventwo = amountNumbersTwo % 2 == 0 ? true : false;
        boolean odd = amountNumbers % 2 != 0 ? true : false;
        boolean oddtwo = amountNumbersTwo % 2 != 0 ? true : false;

        Resultados result = new Resultados(maximum, minimum, amountNumbers, amountNumbersTwo, multipleOfTwo, divOfTwo,
                even, eventwo, odd, oddtwo);

        return result;
    }

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(11, 8, 9, 15, 39, 1, 4, 83);
        List<Integer> numberstwo = Arrays.asList(15, 41, 923, 13, 4, 1, 2, 0);
        System.out.println(biggerNumber(numbers));
        System.out.println(minimumNumber(numbers));
        System.out.println(amount(numbers));
        System.out.println(fusion(numbers));
        System.out.println(fusionar(numbers,numberstwo));
    }
}
