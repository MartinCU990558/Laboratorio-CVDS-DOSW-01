package Idarraga_Estupinan.Reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("01010101"));
        comandos.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public static void ejecutarComando(String comando) {
        if (comando == null) {
            System.out.println("Comando vacío.");
            return;
        }
        String cmd = comando.toUpperCase();
        switch (cmd) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(cmd).run();
                break;

            default:
                System.out.println("Comando desconocido. Intenta alguno de los comandos disponibles.");
        }
    }
        public static void main(String[] args) {

            String[] comandos = {
                    "SALUDAR",
                    "DESPEDIR",
                    "CANTAR",
                    "DANZAR",
                    "BROMEAR",
                    "GRITAR",
                    "SUSURRAR",
                    "ANALIZAR"
            };

            for (String comando : comandos) {
                
                Reto6.ejecutarComando(comando);
                System.out.println();
            }
        }
    }



