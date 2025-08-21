public class Estudiante {
    private String nombre;
    private String escuela;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, String escuela, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.escuela = escuela;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuela() {
        return escuela;
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

