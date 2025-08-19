package reto1;

import reto1.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto1{
    public static void main(String[] args) {

        Estudiante Daniel = new Estudiante("Daniel", 19, "daniel.patino-m@mail.escuelaing.edu.co", 6);

        Estudiante Santiago = new Estudiante("Santiago", 20, "santiago.carmona-p@mail.escuelaing.edu.co", 7);

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(Santiago);
        estudiantes.add(Daniel);

        String mensaje = Mensaje.generarMensaje(estudiantes);

        // Imprimir el mensaje
        System.out.println(mensaje);


    }

}
