package Pareja_Lopez_Albarracin.reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6{
    public static void main(String[] args){
        Map<String,Runnable> link_commands_actions = new HashMap<>();
        link_commands_actions.put("La máquina dice: ", () -> { System.out.print("La máquina dice: "); unified_fragment("SALUDAR"); });
        link_commands_actions.put("La máquina ríe: ", () -> { System.out.print("La máquina ríe: "); unified_fragment("BROMEAR"); });
        link_commands_actions.put("La máquina procesa: ", () -> { System.out.print("La máquina procesa: "); unified_fragment("ANALIZAR"); });
        link_commands_actions.put("La máquina gira y emite chispas: ", () -> { System.out.print("La máquina gira y emite chispas: "); unified_fragment("DANZAR"); });

        link_commands_actions.get("La máquina dice: ").run();
        link_commands_actions.get("La máquina ríe: ").run();
        link_commands_actions.get("La máquina procesa: ").run();
        link_commands_actions.get("La máquina gira y emite chispas: ").run();

    }
    
    public static void unified_fragment(String message){
        switch(message){
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
    
            }
        }

    public void fragment_one(String message){
        switch(message){
            case "SALUDAR":
                System.out.println("¡Saludos, Viajero Del Tiempo y Del Codigo!");
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


    public void fragment_two(String message) {
        switch(message){
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
        }
    }
}
