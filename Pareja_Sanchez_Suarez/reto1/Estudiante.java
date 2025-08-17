public class Estudiante {
    private int semestre, edad;
    private String nombre, correo;

    public Estudiante(int s, int e, String n, String c){
        this.semestre = s;
        this.edad = e;
        this.nombre = n;
        this.correo = c;
    }

    public int getSemestre(){
        return this.semestre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public String getCorreo(){
        return  this.correo;
    }
}
