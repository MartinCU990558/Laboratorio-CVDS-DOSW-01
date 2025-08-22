package Pareja_Lopez_Albarracin.reto2;
import java.util.List;

public class CarreraParalela{
    public static int biggerNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compare).get();
    }
}