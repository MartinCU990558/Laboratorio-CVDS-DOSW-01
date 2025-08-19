package reto1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String correoElectronico;
    private int semestre;


    public Estudiante(String nombre, int edad, String correoElectronico, int semestre ){
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.semestre = semestre;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public int getSemestre(){
        return semestre;
    }


    
}
