package reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6{
    public static void fragmento1(String mensaje){
        switch (mensaje) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("La máquina dice: 'Que los bits te acompañen, hasta la próxima misión.'");
                break;
            case "CANTAR":
                System.out.println("La máquina canta: '01010101'");
                break;
            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: 'Girando en modo fiesta.'");
                break;
        }
    }
    public static void fragmentoDos(String mensaje){
        switch (mensaje) {
            case "BROMEAR":
                System.out.println("La maquina rie y dice... : ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...\"\r\n" + //
                                        "");;
                break;
        
            case "GRITAR":
                System.out.println("La maquina grita ... ¡¡¡ALERTA DE STACK OVERFLOW!!!\"");
                break;

            case "SUSURRAR":
                System.out.println("La maquina susurra... Shhh... los bugs están dormidos.\"\r\n" + //
                                        "");
                break;
            case "ANALIZAR":
                System.out.println(" la maquina procesa... Analizando datos... resultado: ¡Eres increíble programando!\"");                          
                break;}
            }   
    public static void fragmentosUnificados(String mensaje){
        switch (mensaje) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("La máquina dice: 'Que los bits te acompañen, hasta la próxima misión.'");
                break;
            case "CANTAR":
                System.out.println("La máquina canta: '01010101'");
                break;
            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: 'Girando en modo fiesta.'");
                break;
                case "BROMEAR":
                System.out.println("La maquina rie y dice... : ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...\"\r\n" + //
                                        "");;
                break;
            case "GRITAR":
                System.out.println("La maquina grita ... ¡¡¡ALERTA DE STACK OVERFLOW!!!\"");
                break;
            case "SUSURRAR":
                System.out.println("La maquina susurra... Shhh... los bugs están dormidos.\"\r\n" + //
                                        "");
                break;
            case "ANALIZAR":
                System.out.println(" la maquina procesa... Analizando datos... resultado: ¡Eres increíble programando!\"");                          
                break;}
            }   
        
        
    
    public static void main(String[] args) {
        Map<String, Runnable> map = new HashMap<>();
        map.put("SALUDAR", () -> fragmento1("SALUDAR"));
        map.put("DESPEDIR", () -> fragmento1("DESPEDIR"));
        map.put("CANTAR", () -> fragmento1("CANTAR"));
        map.put("DANZAR", () -> fragmento1("DANZAR"));
        map.put("BROMEAR", () -> fragmentoDos("BROMEAR"));
        map.put("GRITAR", () -> fragmentoDos("GRITAR"));
        map.put("SUSURRAR", () -> fragmentoDos("SUSURRAR"));
        map.put("ANALIZAR", () -> fragmentoDos("ANALIZAR"));
        map.get("BROMEAR").run();
        map.get("GRITAR").run();
        map.get("SUSURRAR").run();
        map.get("ANALIZAR").run();
        map.get("SALUDAR").run();
        map.get("DESPEDIR").run();
        map.get("CANTAR").run();
        map.get("DANZAR").run();
    }
}