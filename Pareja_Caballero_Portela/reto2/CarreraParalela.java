import java.util.List;
import java.util.function.Function;

public class CarreraParalela {

    public static int max(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).max().orElse(0); // Primer choque carril 1.
    }

<<<<<<< HEAD
    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null);

    static Function<List<Integer>, Integer>  getSize = list -> list.size();
=======
    public static String maxWithTernary(List<Integer> lista) {
        int max = max(lista); 
        return (max % 2 == 0) ? (max + " es múltiplo de 2") : (max + " no es múltiplo de 2"); // Segunda vuelta carril 1.
    }  

    public static String evenSize(List<Integer> lista) {
        int size = getSize.apply(lista);
        return (size % 2 == 0) ? "The amount of data (" + size + ") es EVEN" 
                               : "The amount of data (" + size + ") is NOT EVEN"; // Tercer choque carril 1.
    }

    static Function<List<Integer>, Integer> getMin = list -> list.stream().min(Integer::compare).orElse(null); // Primer choque carril 2.

    static Function<List<Integer>, Integer>  getSize = list -> list.size(); // Primer choque carril 2.
>>>>>>> feature/reto2_carril_uno_caballero

    

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 17, 2, 9, 25);
<<<<<<< HEAD
        int max = maximo(numbers);
        int min = getMin.apply(numbers);
        int size = getSize.apply(numbers);

        Resultados res = new Resultados(max, min, size);

        System.out.println("Maximum nnumber: " + max);
        System.out.println("Minimum number: " + min);
        System.out.println("Size of numbers: " + size);
=======
        int max = max(numbers); // Primer choque carril 1.
        String max2 = maxWithTernary(numbers); // Segunda vuelta carril 1.
        int min = getMin.apply(numbers); // Primer choque carril 2.
        int size = getSize.apply(numbers); // Primer choque carril 2.
        String evenSize = evenSize(numbers); // Tercer choque carril 1.

        System.out.println("Maximum number: " + max); // Primer choque carril 1.
        System.out.println("Maximum number (ternary): " + max2); // Segunda vuelta carril 1.
        System.out.println(evenSize); // Tercer choque carril 1.
        System.out.println("Minimum number: " + min); // Primer choque carril 2.
        System.out.println("Size of numbers: " + size); // Primer choque carril 2.
>>>>>>> feature/reto2_carril_uno_caballero
    }
}


