package Idarraga_Estupinan.Reto1;
import java.sql.SQLOutput;
import java.util.*;

public class Mensaje {

    public static String generarMensaje(Estudiante estudiante, Estudiante estudiante1) {
        return "!Hola Bienvenidos! nosotros somos la pareja conformada por " + estudiante.getNombre() + "estudiante de la escuela de " + estudiante.getSemestre() +
                " de " + estudiante.getEdad() + " años" + 
        estudiante1.getNombre() +

                "nuestra edad es: " + estudiante.getEdad() + " "+estudiante1.getEdad() +
                ", nuestros correos son: " + estudiante.getCorreo() +" "+ estudiante1.getCorreo() +
                ", estamos en los Semestres: " + estudiante.getSemestre() + " "+estudiante1.getSemestre();
    }

}
