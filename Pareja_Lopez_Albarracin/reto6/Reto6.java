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
}