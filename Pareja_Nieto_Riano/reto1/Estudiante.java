public class Estudiante {
    private String nombre;
    private String edad;
    private String semestre;
    private String correo;

    public Estudiante(String nombre, String edad, String semestre, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

}