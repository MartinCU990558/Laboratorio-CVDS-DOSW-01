package Idarraga_Estupinan.Reto1;
import java.util.*;


public class Estudiante {

    public String nombre;
    public String correo;
    public Integer edad;
    public String semestre;


    public Estudiante(String nombre, String correo, Integer edad, String semestre) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.semestre = semestre;
    }

    public Integer getEdad() {return edad;}

    public String getSemestre() {return semestre;}

    public String getCorreo() {return correo;}

    public String getNombre() {return nombre;}
}