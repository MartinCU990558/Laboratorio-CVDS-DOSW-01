import java.util.HashMap;
import java.util.Map;

public class Reto6 {

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

    public static void main(String args[]) {
        Map<String, Runnable> mapa = new HashMap<>();
        mapa.put("La maquina rie", () -> fragmentoDos("BROMEAR"));
        mapa.put("La maquina grita", () -> fragmentoDos("GRITAR"));
        mapa.put("La maquina susurra", () -> fragmentoDos("SUSURRAR"));
        mapa.put("La maquina procesa", () -> fragmentoDos("ANALIZAR"));

        mapa.get("La maquina rie").run();
        mapa.get("La maquina grita").run();
        mapa.get("La maquina susurra").run();
        mapa.get("La maquina procesa").run();
    }
}
