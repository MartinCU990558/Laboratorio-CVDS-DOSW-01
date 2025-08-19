import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    public Map<String, Runnable> commands = new HashMap<>();

    public Reto6(){
        commands.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        commands.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        commands.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        commands.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));

        commands.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        commands.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        commands.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        commands.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    /**
     * Método que ejecuta el comando según se requiera.
     * @param command
     */
    public void executeCommand(String command){
       switch (command) {
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
                commands.get(command).run(); 
                break;
            default:
                System.out.println("Command not found");
        }  
    }

    public static void main (String[] args){
        Reto6 machine = new Reto6();

<<<<<<< Updated upstream
        // Fragmento 1.
        machine.executeCommand("SALUDAR");
        machine.executeCommand("DESPEDIR");
        machine.executeCommand("CANTAR");
        machine.executeCommand("DANZAR");

        // Fragmento 2.
        machine.executeCommand("BROMEAR");
        machine.executeCommand("GRITAR");
        machine.executeCommand("SUSURRAR");
        machine.executeCommand("ANALIZAR");

        System.out.println("Example");
        machine.executeCommand("SALUDAR");
        machine.executeCommand("BROMEAR");
        machine.executeCommand("ANALIZAR");
        machine.executeCommand("DANZAR");
=======
            Reto6 machineA = new Reto6();
            machineA.executeCommand("SALUDAR");
            machineA.executeCommand("DESPEDIR");
            machineA.executeCommand("CANTAR");
            machineA.executeCommand("DANZAR");
>>>>>>> Stashed changes

    }
}





    