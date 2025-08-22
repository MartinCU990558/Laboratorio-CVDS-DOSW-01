package reto1;

public class Estudiante{
    private String name;
    private int semester;
    private int edad;
    private String email;

    public Estudiante(){
    }
    public Estudiante(String name, int semester, int edad, String email) {
        this.name = name;
        this.semester = semester;
        this.edad = edad;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return name + " estudiante de la escuela de " + semester + " semestre de " + edad + " años, " +
                "nuestro correo institucional es " + email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}