package Pareja_Lopez_Albarracin.reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6{
    public static void main(String[] args){
        Map<Map,Runnable> link = new HashMap<>();
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

