package Pareja_Castiblanco_Leal.reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Mensaje{
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Julian Castiblanco", 6, 21, "pollitos@gmail.com"),
                new Estudiante("Juan Leal", 6, 19, "cosito@gmail.com"));

        String mensaje = estudiantes.stream()
                .map(e -> "¡Hola Bienvenidos! Nosotros somos la pareja conformada por " +
                        e.getName() + " " + e.toString())
                .collect(Collectors.joining(" y "));

        System.out.println(mensaje);
    }
}