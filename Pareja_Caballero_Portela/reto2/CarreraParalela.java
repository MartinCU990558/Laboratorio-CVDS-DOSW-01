import java.util.List;
import java.util.function.Function;


public class CarreraParalela {

    public static int max(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).max().orElse(0); // Primer choque carril 1.
    }
    public static String maxWithTernary(List<Integer> lista) {
        int max = max(lista); 
        return (max % 2 == 0) ? (max + " is a multiple of 2") : (max + " is not a multiple of 2"); // Segunda vuelta carril 1.
    }  
    public static String evenSize(List<Integer> lista) {
        int size = getSize.apply(lista);
        return (size % 2 == 0) ? "The amount of data (" + size + ") es EVEN" 
                               : "The amount of data (" + size + ") is NOT EVEN"; // Tercer choque carril 1.
    }

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null); // Primer choque carril 2.
    static Function<List<Integer>, Integer>  getSize = list -> list.size(); // Primer choque carril 2.

    // Segunda Vuelta Choque de Carriles - Comprobarndo si el numero maximo es divisor de 2.
    static Function<List<Integer>, Integer> getMax = list -> list.stream().max(Integer::compare).orElse(null); 
    static Function<Integer, String> isDivisor = num -> (num % 2 == 0) ? "divisible" : "No divisible"; 

    // Tercer Choque de Carril 2 - Comprobando si el temaño de la lista es impar.
    static Function<Integer, String> isOdd = size -> (size % 2 != 0) ? "odd" : "even"; 



    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 17, 2, 9, 25);

        int max = max(numbers); // Primer choque carril 1.
        String max2 = maxWithTernary(numbers); // Segunda vuelta carril 1.
        String evenSize = evenSize(numbers); // Tercer choque carril 1.

        int min = getMin.apply(numbers); // Primer choque carril 2.
        int size = getSize.apply(numbers); // Primer choque carril 2.
        String div = isDivisor.apply(max); // Segunda vuelta carril 2.
        String oddCheck = isOdd.apply(size); //Tercer choque carril 2.

        System.out.println("Maximum number: " + max); // Primer choque carril 1.
        System.out.println("Maximum number (ternary): " + max2); // Segunda vuelta carril 1.
        System.out.println(evenSize); // Tercer choque carril 1.

        System.out.println("Minimum number: " + min); // Primer choque carril 2.
        System.out.println("Size of numbers: " + size); // Primer choque carril 2.
        System.out.println("The maximum number (" + max + ") is: " + div); // Segunda vuelta carril 2.
        System.out.println("The size of the list is " + size + " and  is: " + oddCheck); // Tercer choque carril 2

    }
}


