<<<<<<< HEAD
package reto3;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reto3 {

    
    public StringBuilder repeticion(String mensaje) {
        StringBuilder resultado = new StringBuilder(); 
        Stream.generate(() -> mensaje)
            .limit(3).forEach(resultado::append);
    
    return resultado;
}
}

=======
package  reto3;

public class Reto3{

    public static StringBuffer mensajeReverso(String mensaje){
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse();
    }

    public static String combinacion(String mensaje){
        return mensaje;
    }

    public static void main(String[] args) {
        System.err.println("NestorCastor");
    }

}
>>>>>>> 970f24f5a9e934233d403e51933a1642dfb23baa
