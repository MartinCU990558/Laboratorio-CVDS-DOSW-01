import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Reto1 {
    public static void main(String args[]) {
        Estudiante juan = new Estudiante("Juan Pablo Nieto", "25", "8", "juan.nieto-co@mail.escuelaing.edu.co");
        Estudiante tulio = new Estudiante("Tulio Riaño", "20", "6", "tulio.riano-s@mail.escuelaing.edu.co");

        Mensaje mensajeInicial = new Mensaje("¡Hola Bienvenidos! Nosotros somos la pareja conformada por");

        List<Estudiante> estudiantes = Arrays.asList(juan, tulio);

        String detalleEstudiantes = estudiantes.stream()
                .map(e -> String.format("%s estudiante de la escuela de %s semestre de %s años",
                        e.getNombre(), e.getSemestre(), e.getEdad()))
                .collect(Collectors.joining(" y "));
        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));
        String mensajeCompleto = String.format("%s %s, nuestros correos institucionales son %s",
                mensajeInicial.getMensaje(),
                detalleEstudiantes,
                correos);
        System.out.println(mensajeCompleto);
    }
}