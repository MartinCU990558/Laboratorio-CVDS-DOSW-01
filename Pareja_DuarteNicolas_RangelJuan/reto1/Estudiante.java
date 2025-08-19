package Pareja_DuarteNicolas_RangelJuan.reto1;
import java.util.*;
import java.util.stream.Collectors;
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre,String apellido, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.apellido = apellido;
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
    public String getApellido() {
        return apellido;
    }
    public static void main(String[] args) {
        List<Estudiante> pareja = Arrays.asList(
                new Estudiante("Nicolas", "Duarte", 21, "nicolas.duarte@mail.escuelaing.edu.co", 6),
                new Estudiante("Juan", "Rangel", 22, "juan.rangel@mail.escuelaing.edu.co", 5)
        );

        String mensaje = Mensaje.generar(pareja);
        System.out.println(mensaje);
    }
}
