
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}
class MensajeBienvenida {
    public static String crearMensaje(List<Estudiante> estudiantes) {
        String descripciones = estudiantes.stream()
                .map(e -> e.getNombre() + " estudiante de la escuela de "
                        + e.getSemestre() + " semestre de " + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "
                + descripciones + ", nuestros correos institucionales son "
                + correos;
    }
}

public class Reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Diego Chavarro", 21, "diego.chavarro@mail.escuelaing.edu.co", 6),
                new Estudiante("Ana Fiquitiva", 22, "ana.fiquitiva@mail.escuelaing.edu.co", 5)
        );

        String mensaje = MensajeBienvenida.crearMensaje(estudiantes);
        System.out.println(mensaje);
    }
}

