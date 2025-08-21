import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Juan Suarez", "Escuela", 20, "juan.sfonseca@mail.escuelaing.edu.co", 7),
                new Estudiante("Raquel Selma", "Escuela", 26, "raquel.selma-a@mail.escuelaing.edu.co", 5)
        );

        String mensaje = "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " +
                estudiantes.stream()
                        .map(e -> e.getNombre() + " estudiante de la " + e.getEscuela() + " de " +
                                e.getSemestre() + " semestre de " + e.getEdad() + " años")
                        .collect(Collectors.joining(" y ")) +
                ", nuestros correos institucionales son " +
                estudiantes.stream()
                        .map(Estudiante::getCorreo)
                        .collect(Collectors.joining(" y "));

        System.out.println(mensaje);
    }
}

