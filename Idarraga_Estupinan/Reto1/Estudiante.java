package Idarraga_Estupinan.Reto1;
import java.util.*;


public class Estudiante {

    public String nombre;
    public String correo;
    public Integer edad;
    public Integer semestre;


    public Estudiante(String nombre, String correo, Integer edad, Integer semestre) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.semestre = semestre;
    }

    public Integer getEdad() {return edad;}

    public Integer getSemestre() {return semestre;}

    public String getCorreo() {return correo;}

    public String getNombre() {return nombre;}
}