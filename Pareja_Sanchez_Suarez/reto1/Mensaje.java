import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mensaje {
    private List<Estudiante> Estudiantes;

    public Mensaje(){
        this.Estudiantes = new ArrayList<>();
    }


    public String crearMensaje() {
        List<Integer> Edades = Estudiantes.stream()
                .map(Estudiante::getEdad)
                .collect(Collectors.toList());

        List<Integer> Semestre = Estudiantes.stream()
                .map(Estudiante::getSemestre)
                .collect(Collectors.toList());

        List<String> Correo = Estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.toList());

        List<String> Nombre = Estudiantes.stream()
                .map(Estudiante::getNombre)
                .collect(Collectors.toList());

        String mensaje = "Hola Bienvenidos! Nosotros somos la pareja conformada por " + Nombre.get(0) +
                ", estudiante de la escuela de " + Semestre.get(0) + " semestre, de " + Edades.get(0) + " años, y " +
                Nombre.get(1) + ", estudiante de la escuela de " + Semestre.get(1) + " semestre, de " + Edades.get(1) + " años. " +
                "Nuestros correos institucionales son " + Correo.get(0) + " y " + Correo.get(1) + ".";

        return mensaje;
    }


    public void setEstudiante(int s, int e, String n, String c){
        Estudiante estudiante = new Estudiante(s,e,n,c);
        this.Estudiantes.add(estudiante);
    }
}
