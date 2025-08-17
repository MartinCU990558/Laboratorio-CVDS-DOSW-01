public class Reto1 {
    public static void main(String[] args) {
        Mensaje m = new Mensaje();
        m.setEstudiante(6,22,"Oscar Sanchez","oscar.sporras@mail.escuelaing.edu.co");
        m.setEstudiante(8,20,"Santiago Suarez", "santiago.suarez-p@mail.escuelaing.edu.co");
        System.out.println(m.crearMensaje());

    }
}