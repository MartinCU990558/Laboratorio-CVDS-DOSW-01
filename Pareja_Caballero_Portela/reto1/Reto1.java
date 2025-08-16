package Pareja_Caballero_Portela.reto1;

import java.util.ArrayList;
import java.util.List;

public class Reto1 {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan Caballero", 18, "juan.ccastellanos@mail.escuelaing.edu.co", 6));
        estudiantes.add(new Estudiante("Robinson Portela", 19, "robinson.nunez-p@mail.escuelaing.edu.co", 6));

        String mensaje = Mensaje.generar(estudiantes);
        System.out.println(mensaje);
    }
}
