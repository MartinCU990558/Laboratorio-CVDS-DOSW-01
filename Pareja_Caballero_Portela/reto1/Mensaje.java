package Pareja_Caballero_Portela.reto1;

import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {

    public static String generar(List<Estudiante> estudiantes) {
        String mensajeIntegrantes = estudiantes.stream()
                .map(est -> String.format("%s estudiante de la escuela de %d semestre de %d años",
                        est.getNombre(), est.getSemestre(), est.getEdad()))
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return String.format(
                "¡Hola Bienvenidos! Nosotros somos la pareja conformada por %s, nuestros correos institucionales son %s.",
                mensajeIntegrantes, correos
        );
    }
}
