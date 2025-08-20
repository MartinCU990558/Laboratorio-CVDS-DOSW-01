package reto3;
import java.util.stream.IntStream;

public class reto3 {
    public static void main(String[] args) {
        
    }
    public StringBuilder repeticion(String mensaje ){
         StringBuilder resultado = new StringBuilder();
        
        IntStream.range(0, 3)
                .forEach(i -> resultado.append(mensaje));
        
        return resultado;
    }
}

