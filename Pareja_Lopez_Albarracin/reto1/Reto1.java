package Pareja_Lopez_Albarracin.reto1;
import java.util.*;
import java.util.stream.Collectors;

public class Reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Julian Lopez", "18", "6", "julian.lopez-b@mail.escuelaing.edu.co"),
                new Estudiante("Sebastian Albarracin", "20", "8", "sebastian.albarracin@mail.escuelaing.edu.co")
        );

        String mensaje = "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " +
                estudiantes.stream()
                        .map(e -> e.getNombre() + " estudiante de la escuela de " +
                                e.getSemestre() + " semestre de " +
                                e.getEdad() + " años")
                        .collect(Collectors.joining(" y ")) +
                ", nuestros correos institucionales son " +
                estudiantes.stream()
                        .map(Estudiante::getCorreo)
                        .collect(Collectors.joining(" y "));

        Mensaje bienvenida = new Mensaje(mensaje);

        System.out.println(bienvenida.getMensaje());
    }
}
