package Pareja_Bermudez_Palacios.Reto1;

public class Message {
    public static String generateMessage(Student student1, Student student2) {
        return "¡Hola Bienvenidos! Nosotros somos la pareja conformada por "
                + student1.getFullName() + " estudiante de la escuela de " + student1.getSemester()
                + " semestre de " + student1.getAge() + " años y "
                + student2.getFullName() + " estudiante de la escuela de " + student2.getSemester()
                + " semestre de " + student2.getAge() + " años, nuestros correos institucionales son "
                + student1.getEmail() + " y " + student2.getEmail();
    }
}
