package Pareja_DuarteNicolas_RangelJuan.reto1;
import java.util.*;
import java.util.stream.Collectors;
public class Mensaje {
    public static String generar(List<Estudiante> estudiantes) {
        String detalles = estudiantes.stream()
                .map(e -> e.getNombre() + " " + e.getApellido() + " estudiante de la escuela de "
                        + e.getSemestre() + " semestre de " + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "
                + detalles + ", nuestros correos institucionales son " + correos;
    }
}
