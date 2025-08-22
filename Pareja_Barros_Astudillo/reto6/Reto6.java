import java.util.HashMap;
import java.util.Map;

public class Reto6 {
    private final Map<String, Runnable> comandos = new HashMap<>();


    public void ejecutarComando(String comando) {
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
                System.out.println("La máquina no reconoce el comando: " + comando);
        }
    }




}