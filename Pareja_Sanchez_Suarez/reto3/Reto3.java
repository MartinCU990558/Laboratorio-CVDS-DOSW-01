package reto3;

public class Reto3 {
    public static void main(String[] args) {
        Estudiante estudianteB = new Estudiante("EstudianteB", Mensaje::ecoConBuffer);

        estudianteB.enviarMensaje("Adios ");
    }
}
