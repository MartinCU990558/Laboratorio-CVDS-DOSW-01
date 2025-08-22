package Idarraga_Estupinan.Reto1;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Reto_1 {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Sergio Idarraga", "sergio.idarraga-t@mail.escuelaing.edu.co", 20, "7"));
        estudiantes.add(new Estudiante("Karol Estupiñan", "karol.estupinan-v@mail.escuelaing.edu.co", 20, "6to"));


        List<String> mensajes = IntStream.range(0, estudiantes.size() / 2)
                .mapToObj(i -> Mensaje.generarMensaje(estudiantes.get(i * 2), estudiantes.get(i * 2 + 1)))
                .collect(Collectors.toList());


        mensajes.forEach(System.out::println);
    }



}