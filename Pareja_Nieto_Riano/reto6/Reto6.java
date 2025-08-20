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
        mapa.put("La maquina dice", () -> fragmentoUno("SALUDAR"));
        mapa.put("La maquina dice", () -> fragmentoUno("DESPEDIR"));
        mapa.put("La maquina canta", () -> fragmentoUno("CANTAR"));
        mapa.put("La maquina gira y emite chispas", () -> fragmentoUno("DANZAR"));
        mapa.get("La maquina dice").run();
        mapa.get("La maquina dice").run();
        mapa.get("La maquina canta").run();
        mapa.get("La maquina gira y emite chispas").run();

    }
}