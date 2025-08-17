package Idarraga_Estupinan.Reto1;
import java.sql.SQLOutput;
import java.util.*;

public class Mensaje {

    public static String generarMensaje(Estudiante estudiante, Estudiante estudiante1) {
        return "!Hola Bienvenidos! nosotros somos la pareja conformada por " + estudiante.getNombre() + " estudiante de la escuela de " + estudiante.getSemestre() +
                " semestre de " + estudiante.getEdad() + " años y " +
        estudiante1.getNombre() + " estudiante de la escuela de "+ estudiante1.getSemestre() + " semestre de "+estudiante1.getEdad() +
                " años, nuestros correos institucionales son " + estudiante.getCorreo() +" y "+ estudiante1.getCorreo();
    }

}
