package reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", ()-> System.out.println("La máquina dice: \"¡Saludos, viajero del tiempo y del código!\""));
        comandos.put("DESPEDIR", ()-> System.out.println("La máquina dice: \"Que los bits te acompañen, hasta la próxima misión.\""));
        comandos.put("CANTAR", ()-> System.out.println("La máquina canta: \"01010101\""));
        comandos.put("DANZAR", ()-> System.out.println("La máquina gira y emite chispas: \"Girando en modo fiesta.\""));
        comandos.put("BROMEAR", ()-> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", ()-> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", ()-> System.out.println("Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", ()-> System.out.println("Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println("Comando no reconocido: " + comando);
        }
    }

    public static void main(String[] args) {
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");

    }
}
