package reto3;

public class Reto3 {
    public static void main(String[] args) {
        java.util.function.Function<String, String> repetirTresVeces = mensaje -> MsgBuilder.buildMessage(mensaje);
        String resultado = repetirTresVeces.apply("Hello World");
        System.out.println(resultado);

        String mensaje = "Hello World";
        String resultadoReverso = MsgBuilder.reverseMessage(mensaje);
        System.out.println(resultadoReverso);

        String msg = "Hello World";
        String invertedAndRepeatedMessage = MsgBuilder.combineFunctions(msg);
        System.out.println(invertedAndRepeatedMessage);

    }
}