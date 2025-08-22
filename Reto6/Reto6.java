package Idarraga_Estupinan.Reto6;

public class Reto6 {

    public static void ejecutarComando(String comando) {
        if (comando == null) {
            System.out.println("Comando vacío.");
            return;
        }
        switch (comando.toUpperCase()) {
            case "SALUDAR":
                System.out.println("¡Saludos, viajero del tiempo y del código!");
                break;

            case "DESPEDIR":
                System.out.println("Que los bits te acompañen, hasta la próxima misión.");
                break;

            case "CANTAR":
                System.out.println("01010101");
                break;

            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;

            default:
                System.out.println("Comando desconocido. Intenta: SALUDAR, DESPEDIR, CANTAR o DANZAR.");
        }
    }

}
