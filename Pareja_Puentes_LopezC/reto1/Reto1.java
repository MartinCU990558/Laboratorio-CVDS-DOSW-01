package reto1;

import java.util.Arrays;
import java.util.List;

public class reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
            new Estudiante("Juan Pérez", 21, "juan.perez@mail.escueling.edu.co", 6),
            new Estudiante("Miguel Roncancio", 22, "miguel.roncancio@mail.escuelaing.edu.co", 5)
        );
        
        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}