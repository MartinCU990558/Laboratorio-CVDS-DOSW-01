package reto3;

public class Reto3 {
    public static void main(String[] args) {
        Estudiante estudianteA= new Estudiante("EstudianteA",Mensaje::ecoConBuilder);
        estudianteA.enviarMensaje("Hola ");
    }
}