import java.util.List;
import java.util.function.Function;


public class CarreraParalela {

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null); //Primer choque carril 2.

    static Function<List<Integer>, Integer>  getSize = list -> list.size();  //Primer choque carril 2.

    //Segunda Vuelta Choque de Carriles - Comprobarndo si el numero maximo es divisor de 2

    static Function<List<Integer>, Integer> getMax = list -> list.stream().max(Integer::compare).orElse(null); 

    static Function<Integer, String> isDivisor = num -> (num % 2 == 0) ? "divisible" : "No divisible"; 


    public static void main(String[] args) {
    List<Integer> numbers = List.of(3, 17, 2, 9, 25);
    int min = getMin.apply(numbers); //Primer choque carril 2.
    int size = getSize.apply(numbers); //Primer choque carril 1.
    int max = getMax.apply(numbers); //Segunda  vuelba choque carril 1
    String div = isDivisor.apply(max); //Segunda  vuelba choque carril 1

    System.out.println("List: " + numbers);  //Primer choque carril 2.
    System.out.println("Minimum number: " + min); //Primer choque carril 1.
    System.out.println("Size of numbers: " + size); //Primer choque carril 1
    System.out.println("Maximum number" + max); //Segunda  vuelba choque carril 1
    System.out.println("The maximum number (" + max + ") is: " + div); // Segunda vueltac hoque carril 1
    }
} 