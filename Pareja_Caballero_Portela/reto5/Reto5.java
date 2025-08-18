import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Reto5{

    public static void generateNumbers(){
        Random ran = new Random();
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < 10; i++){
            numbers.add(ran.nextInt(50) + 1);
        }

        System.out.println("Numbers generated");
        numbers.forEach(n -> System.out.println(n + " "));
        System.out.println("\n");
        
        numbers.stream().filter(n -> n % 3 != 0)
        .forEach(n -> System.out.println("Numbers without multiples of 3: " + n));
    }

    public static void main(String[] args) {
        generateNumbers();
    }
}

    
