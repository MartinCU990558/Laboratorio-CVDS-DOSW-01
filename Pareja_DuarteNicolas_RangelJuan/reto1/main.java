package Pareja_DuarteNicolas_RangelJuan.reto1;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Estudiante> pareja = Arrays.asList(
                new Estudiante("Nicolas", "Duarte", 21, "nicolas.duarte@mail.escuelaing.edu.co", 6),
                new Estudiante("Juan", "Rangel", 22, "juan.rangel@mail.escuelaing.edu.co", 5)
        );

        String mensaje = Mensaje.generar(pareja);
        System.out.println(mensaje);
    }
}
