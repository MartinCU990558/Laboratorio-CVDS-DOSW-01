package reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6{
    public static void fragmento1(String mensaje){
        switch (mensaje) {
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
        }
    }

    public static void main(String[] args) {
        Map<String, Runnable> map = new HashMap<>();
        map.put("La maquina dice:", () -> fragmento1("SALUDAR"));
        map.put("La maquina dice:", () -> fragmento1("DESPEDIR"));
        map.put("La maquina canta:", () -> fragmento1("CANTAR"));
        map.put("La maquina gira y emite chispas:", () -> fragmento1("DANZAR"));
    }
}