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

    public static void unificacionFragmentos(String mensaje) {
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
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("Shhh... los bugs están dormidos.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("NO COMMAND VALID");
                break;
        }

    }

    public static void main(String args[]) {
        Map<String, Runnable> mapa = new HashMap<>();
        mapa.put("La maquina dice", () -> unificacionFragmentos("SALUDAR"));
        mapa.put("La maquina rie", () -> unificacionFragmentos("BROMEAR"));
        mapa.put("La maquina procesa", () -> unificacionFragmentos("ANALIZAR"));
        mapa.put("La maquina gira y emite chispas", () -> unificacionFragmentos("DANZAR"));
        mapa.get("La maquina dice").run();
        mapa.get("La maquina rie").run();
        mapa.get("La maquina procesa").run();
        mapa.get("La maquina gira y emite chispas").run();

    }
}