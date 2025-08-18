import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    public Map<String, Runnable> commands = new HashMap<>();

    public Reto6(){
        commands.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        commands.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        commands.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        commands.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    public void executeComand(String command){
       switch (command) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                commands.get(command).run(); 
                break;
            default:
                System.out.println("Command not found");
        }  
    }

    public static void main (String[] args){
        Reto6 machine = new Reto6();

        machine.executeComand("BROMEAR");
        machine.executeComand("GRITAR");
        machine.executeComand("SUSURRAR");
        machine.executeComand("ANALIZAR");

    }
}