import java.util.Map;
import java.util.HashMap;

public class Reto6{

    /**
     * Mapa de comandos
     */
    public Map<String, Runnable> commands = new HashMap<>();


        public Reto6() {
            commands.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
            commands.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
            commands.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
            commands.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
        }


        /**
         * Ejecuta una frase de los comandos
         * @param command
         */
        public void executeCommand(String command){
            switch(command) {
                case "SALUDAR":
                case "DESPEDIR":
                case "CANTAR":
                case "DANZAR":
      
                commands.get(command).run();
                break;
            }
        }
        

        public static void main(String[] args) {

            Reto6 machineA = new Reto6();
            machineA.executeCommand("SALUDAR");
            machineA.executeCommand("DESPEDIR");
             machineA.executeCommand("CANTAR");
              machineA.executeCommand("DANZAR");

    }
}


    


