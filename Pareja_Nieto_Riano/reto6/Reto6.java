import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    public static void fragmentoUno(String mensaje) {
        switch (mensaje) {
            case "SALUDAR":
                System.out.println("Saludos, viajero del tiempo y del codigo!");
                break;
            case "DESPEDIR":
                System.out.println("Que los bits te acompanen, hasta la proxima mision.");
                break;
            case "CANTAR":
                System.out.println("01010101");
                break;
            case "DANZAR":
                System.out.println("Girando en modo fiesta.");
                break;
        }
    }

    public static void fragmentoDos(String mensaje) {
        switch (mensaje) {
            case "BROMEAR":
                System.out.println("Por que la RAM rompio con la CPU? Porque necesitaba espacio...");
                break;
            case "GRITAR":
                System.out.println("!!!ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("Shhh... los bugs estan dormidos.");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: Eres increible programando!");
                break;
        }
    }

    public static void unificacionFragmentos(String mensaje) {
    
    }



    public static void main(String args[]) {
        Map<String, Runnable> mapa = new HashMap<>();

        mapa.put("La maquina saluda", () -> fragmentoUno("SALUDAR"));
        mapa.put("La maquina se despide", () -> fragmentoUno("DESPEDIR"));
        mapa.put("La maquina canta", () -> fragmentoUno("CANTAR"));
        mapa.put("La maquina danza", () -> fragmentoUno("DANZAR"));

        mapa.put("La maquina rie", () -> fragmentoDos("BROMEAR"));
        mapa.put("La maquina grita", () -> fragmentoDos("GRITAR"));
        mapa.put("La maquina susurra", () -> fragmentoDos("SUSURRAR"));
        mapa.put("La maquina procesa", () -> fragmentoDos("ANALIZAR"));

        mapa.get("La maquina saluda").run();
        mapa.get("La maquina se despide").run();
        mapa.get("La maquina canta").run();
        mapa.get("La maquina danza").run();

        mapa.get("La maquina rie").run();
        mapa.get("La maquina grita").run();
        mapa.get("La maquina susurra").run();
        mapa.get("La maquina procesa").run();
    }
}
