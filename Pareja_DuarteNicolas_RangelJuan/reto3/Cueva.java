package Pareja_DuarteNicolas_RangelJuan.reto3;

import java.util.stream.IntStream;

public class Cueva {
    private String mensaje;

    public Cueva(String mensaje) {
        this.mensaje = mensaje;
    }
    public String magia(){
        StringBuilder sb = new StringBuilder(mensaje);
        StringBuffer aux = new StringBuffer(mensaje);
        IntStream.range(0,2).forEach(i -> sb.append(" " + mensaje));
        aux.reverse();
        return sb.toString().trim() + " " + aux;
    }
    public static void main(String[] args) {
        Cueva cueva = new Cueva("hola bro");
        String resultado=cueva.magia();
        System.out.println(resultado);

    }
}

