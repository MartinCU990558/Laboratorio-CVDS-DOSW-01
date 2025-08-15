package reto1;

import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {

    public static String generarMensaje(List<Estudiante> estudiantes) {
        // Crear descripción de los estudiantes
        String descripcionEstudiantes = estudiantes.stream()
                .map(e -> String.format("%s estudiante de la escuela de %d semestre de %d años",
                        e.getNombre(), e.getSemestre(), e.getEdad()))
                .collect(Collectors.joining(" y "));

        String correosEstudiantes = estudiantes.stream()
                .map(Estudiante::getCorreoElectronico)
                .collect(Collectors.joining(" y "));


        return String.format(
                "¡Hola Bienvenidos! Nosotros somos la pareja conformada por %s, nuestros correos institucionales son %s.",
                descripcionEstudiantes, correosEstudiantes);
    }
}
