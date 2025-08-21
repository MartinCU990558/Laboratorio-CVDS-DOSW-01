package Pareja_Barros_Astudillo.reto1;

import java.util.*;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args) {
        // Lista de estudiantes
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Sebastián Barros", 22, "sebastian.barros@mail.escuelaing.edu.co", 6),
                new Estudiante("Carlos Astudillo", 22, "carlos.astudillo@mail.escuelaing.edu.co", 5)
        );

        // Lambda para armar el detalle de cada estudiante
        String detalleEstudiantes = estudiantes.stream()
                .map(e -> e.getNombre() + " estudiante de la escuela de " + e.getSemestre() +
                        " semestre de " + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        // Lambda para los correos
        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        // Mensaje final
        String mensaje = "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "
                + detalleEstudiantes + ", nuestros correos institucionales son " + correos;

        System.out.println(mensaje);
    }
}
