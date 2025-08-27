package Pareja_Ramirez_Guzman.Reto6_RamirezGuzman;

import java.util.*;

public class Main {
    public static void executeDecision(Map<String, Runnable> decisions, String command){
        decisions.getOrDefault(command, () -> System.out.println("Decisión inexsistente.")).run();
    }
    public static void main(String[] args) {
        Map<String, Runnable> decisions = new HashMap<>();
        decisions.put("SALUDAR", () -> System.out.println("¡Saludos, viajero del tiempo y del código!"));
        decisions.put("DESPEDIR", () -> System.out.println("Que los bits te acompañen, hasta la próxima misión."));
        decisions.put("CANTAR", () -> System.out.println("01010101"));
        decisions.put("DANZAR", () -> System.out.println("Girando en modo fiesta"));

        decisions.put("BROMEAR", () -> System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        decisions.put("GRITAR", () -> System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        decisions.put("SUSURRAR", () -> System.out.println("Shhh... los bugs están momidos."));
        decisions.put("ANALIZAR", () -> System.out.println("Analizando datos... resultado: ¡Eres increíble programando!"));

        decisions.put("APAGAR", () -> {
            System.out.println("Apagando datos... maquina momida...");
            System.exit(0);
        });

        executeDecision(decisions, "SALUDAR");
        executeDecision(decisions, "DESPEDIR");
        executeDecision(decisions, "CANTAR");
        executeDecision(decisions, "DANZAR");
        executeDecision(decisions, "BROMEAR");
        executeDecision(decisions, "GRITAR");
        executeDecision(decisions, "SUSURRAR");
        executeDecision(decisions, "ANALIZAR");
        executeDecision(decisions, "APAGAR");
    }
}

