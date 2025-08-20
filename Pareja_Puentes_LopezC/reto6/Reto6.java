package reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6{
    public static void fragmentoDos(String mensaje){
        switch (mensaje) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...\"\r\n" + //
                                        "");;
                break;
        
            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!\"");
                break;

            case "SUSURRAR":
                System.out.println("Shhh... los bugs están dormidos.\"\r\n" + //
                                        "");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: ¡Eres increíble programando!\"");                          
                break;
            }   
    }
    public static void main(String args[]){
        Map<String,Runnable> lista =new HashMap<>();
        lista.put("La maquina rie", () -> fragmentoDos("BROMEAR"));
        lista.put("La maquina grita", () -> fragmentoDos("GRITAR"));
        lista.put("La maquina susurra", () -> fragmentoDos("SUSURRAR"));
        lista.put("La maquina procesa", () -> fragmentoDos("ANALIZAR"));
        lista.get("la maquina rie").run();
        lista.get("La maquina grita").run();
        lista.get("La maquina susurra").run();
        lista.get("la maquina procesa").run();
    }
}