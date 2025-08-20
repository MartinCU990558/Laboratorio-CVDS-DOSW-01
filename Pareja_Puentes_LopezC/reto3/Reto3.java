package reto3;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reto3 {
    public static void main(String[] args) {
        
    }
    
    public StringBuilder repeticion(String mensaje) {
        StringBuilder resultado = new StringBuilder(); 
        Stream.generate(() -> mensaje)
            .limit(3).forEach(resultado::append);
    
    return resultado;
}
}

