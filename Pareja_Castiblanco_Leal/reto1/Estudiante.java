public class Estudiante{
    private String name;
    private String semester;
    private String edad;
    private String email;

    public Estudiante(){
    }
    public Estudiante(String name, String semester, String edad, String email) {
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

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEdad() {
        return edad;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}