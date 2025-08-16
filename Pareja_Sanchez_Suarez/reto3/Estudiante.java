package reto3;

import java.util.function.Function;

public class Estudiante {
    private String nombre;
    private final Function<String, String> estrategia;

    public Estudiante(String nombre, Function<String, String> estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public void enviarMensaje(String mensaje) {
        String eco = estrategia.apply(mensaje);
        System.out.println(nombre + " dice:" + mensaje);
        System.out.println("Eco:" + eco);
        System.out.println();
    }
}
