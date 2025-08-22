package Pareja_Bermudez_Palacios.Reto1;

public class Reto_1 {
    public static void main(String[] args) {
        Student student1 = new Student("David", "Palacios", 5, 19, "david.palacios-p@mail.escuelaing.edu.co");
        Student student2 = new Student("Valeria", "Bermúdez", 5, 19, "valeria.bermudez-a@mail.escuelaing.edu.co");

        String message = Message.generateMessage(student1, student2);
        System.out.println(message);
    }

}
