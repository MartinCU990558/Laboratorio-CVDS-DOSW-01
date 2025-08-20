package reto3;
import java.util.stream.Stream;

public class Reto3 {

    
    public static StringBuilder repeticion(String mensaje) {
        StringBuilder resultado = new StringBuilder(); 
        Stream.generate(() -> mensaje)
            .limit(3).forEach(resultado::append);
    
    return resultado;
    }

    public static StringBuffer reverso(String mensaje){
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse();
    }

    public static void main(String[] args) {
        System.out.println("");
    }

}