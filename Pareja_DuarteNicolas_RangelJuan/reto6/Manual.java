package Pareja_DuarteNicolas_RangelJuan.reto6;


import java.util.HashMap;
import java.util.Map;

public class Manual {

    private final Map<String, Runnable> comandos;

    public Manual() {
        comandos = new HashMap<>();

        comandos.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("01010101"));
        comandos.put("DANZAR", () -> System.out.println("Girando en modo fiesta."));
        comandos.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando.toUpperCase());
        if (accion != null) {
            accion.run();
        }
    }
}


