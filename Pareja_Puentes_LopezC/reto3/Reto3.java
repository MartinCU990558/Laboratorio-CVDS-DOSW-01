package reto3;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

    public static String combinacion(String mensaje){
        String repetido = IntStream.range(0, 3)
                                   .mapToObj(i -> mensaje)
                                   .collect(Collectors.joining(" "));
        return reverso(repetido).toString();
    }

    public static void main(String[] args) {
        Function<String, String> mensaje = (msg) -> combinacion(msg);
        String resultado = mensaje.apply("Hola");
        System.out.println(resultado);
    }

}