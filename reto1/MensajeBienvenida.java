package reto1;

import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static String generarMensaje(List<Estudiante> estudiantes) {
        String descripcion = estudiantes.stream()
            .map(e -> e.getNombre() + " estudiante de la escuela de " + 
                 e.getSemestre() + "° semestre de " + e.getEdad() + " años")
            .collect(Collectors.joining(" y "));
        
        String correos = estudiantes.stream()
            .map(Estudiante::getCorreo)
            .collect(Collectors.joining(" y "));
        
        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " + 
               descripcion + ", nuestros correos institucionales son " + correos;
    }
}