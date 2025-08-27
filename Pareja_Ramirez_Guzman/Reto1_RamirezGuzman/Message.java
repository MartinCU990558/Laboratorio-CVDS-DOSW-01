package Pareja_Ramirez_Guzman.Reto1 - RamirezGuzman;

/**
 * Corresponde al objeto mensaje.
 */
public class Message {
    private String message;

    /**
     * Método constructor del mensaje que presentará a los estudiantes
     * del equipo.
     * @param s
     * @param t
     *
     * Nota: Debo recordar ponerle espacios al inicio y
     * final de cada una de las frases para que luzca
     * como un texto normal.
     *
     */
    public Message(Students s, Students t) {

        this.message = "¡Hola, bienvenidos! Nosotros somos la pareja conformada por:\n " + s.getName() +
                       " estudiante de la escuela de " + s.getSemester() + " semestre de " + s.getAge() + " años.\n Y " +
                       t.getName() + " estudiante de la escuela de " + t.getSemester() + " de " + t.getAge() +
                       " años.\n Nuestros correos institucionales son:\n " + s.getEmail() + " y " + t.getEmail();
    }

    @Override
    public String toString() {
        return message;
    }
}