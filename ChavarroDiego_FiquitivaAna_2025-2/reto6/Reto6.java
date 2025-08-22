import java.util.*;

public class Reto6 {

    private static Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> System.out.println("La m\u00e1quina dice: \u00a1Saludos, viajero del tiempo y del c\u00f3digo!"));
        comandos.put("DESPEDIR", () -> System.out.println("La m\u00e1quina dice: Que los bits te acompa\u00f1en, hasta la pr\u00f3xima misi\u00f3n."));
        comandos.put("CANTAR", () -> System.out.println("La m\u00e1quina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La m\u00e1quina gira y emite chispas: Girando en modo fiesta."));
        comandos.put("BROMEAR", () -> System.out.println("La m\u00e1quina r\u00ede: \u00bfPor qu\u00e9 la RAM rompi\u00f3 con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("La m\u00e1quina grita: \u00a1\u00a1\u00a1ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La m\u00e1quina susurra: Shhh... los bugs est\u00e1n dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("La m\u00e1quina procesa: Analizando datos... resultado: \u00a1Eres incre\u00edble programando!"));
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no reconocido");
        }
    }

    public static void main(String[] args) {
        String[] demoComandos = {"SALUDAR", "BROMEAR", "ANALIZAR", "DANZAR", "GRITAR", "DESPEDIR", "CANTAR", "SUSURRAR"};
        for (String cmd : demoComandos) {
            ejecutarComando(cmd);
        }
    }
}