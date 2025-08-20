package reto1;

import java.util.Arrays;
import java.util.List;

public class reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan Puentes", 20, "juan.puentes@mail.escueling.edu.co", 6),
            new Estudiante("Nestor Lopez", 19, "nestor.lopez@mail.escuelaing.edu.co", 6)
        );
        
        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}