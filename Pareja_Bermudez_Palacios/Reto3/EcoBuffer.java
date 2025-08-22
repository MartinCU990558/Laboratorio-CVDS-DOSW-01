package Pareja_Bermudez_Palacios.Reto3;

public class EcoBuffer {

    public static String invertirMensaje(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String resultado = invertirMensaje("Hola");
        System.out.println(resultado);
    }
}
