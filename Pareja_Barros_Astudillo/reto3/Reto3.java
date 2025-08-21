package Pareja_Barros_Astudillo.reto3;

import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Reto3 {
    public static String procesarMensaje(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje);
            if (i < 2) sb.append(" ");
        }
        String repetido = sb.toString();
        
        StringBuffer buffer = new StringBuffer(repetido);
        return buffer.reverse().toString();
    }
    
    public static void main(String[] args) {
        Function<String, String> ecoMisterioso = Reto3::procesarMensaje;

        String resultado = Stream.of("Hola")
            .map(ecoMisterioso)
            .collect(Collectors.joining());
            
        System.out.println("Eco misterioso: " + resultado);
    }
}