import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    public static void fragmentoUno(String mensaje) {
        switch (mensaje) {
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
        }
    }

    public static void main(String args[]) {
        Map<String, Runnable> mapa = new HashMap<>();
        mapa.put("SALUDAR", () -> fragmentoUno("SALUDAR"));
        mapa.put("DESPEDIR", () -> fragmentoUno("DESPEDIR"));
        mapa.put("CANTAR", () -> fragmentoUno("CANTAR"));
        mapa.put("DANZAR", () -> fragmentoUno("DANZAR"));
        mapa.get("SALUDAR").run();
        mapa.get("DESPEDIR").run();
        mapa.get("CANTAR").run();
        mapa.get("DANZAR").run();

    }
}