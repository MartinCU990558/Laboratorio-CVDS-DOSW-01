package reto6;

import java.util.HashMap;
import java.util.Map;

public  class Manual {
    private String accion;
    private Map<String, Runnable> acciones;

    public Manual() {
        this.accion = null;
        this.acciones = new HashMap<String, Runnable>();
        setAccion();
    }

    public void setAccion() {
        acciones.put("SALUDAR", () -> System.out.println(saludos("SALUDAR")));
        acciones.put("DESPEDIR", () -> System.out.println(saludos("DESPEDIR")));
        acciones.put("CANTAR", () -> System.out.println(saludos("CANTAR")));
        acciones.put("DANZAR", () -> System.out.println(saludos("DANZAR")));
        acciones.put("BROMEAR", () -> System.out.println(saludos("BROMEAR")));
        acciones.put("GRITAR", () -> System.out.println(saludos("GRITAR")));
        acciones.put("SUSURRAR", () -> System.out.println(saludos("SUSURRAR")));
        acciones.put("ANALIZAR", () -> System.out.println(saludos("ANALIZAR")));
    }

    public String saludos(String nombre) {
        switch (nombre) {
            case "SALUDAR":
                accion = "La máquina dice: ¡Saludos, viajero del tiempo y del código!";
                break;
            case "DESPEDIR":
                accion = "La máquina dice: Que los bits te acompañen, hasta la próxima misión";
                break;
            case "CANTAR":
                accion = "La máquina canta: 01010101";
                break;
            case "DANZAR":
                accion = "La máquina gira y emite chispas: \"Girando en modo fiesta.\"";
                break;
            case "BROMEAR":
                accion = "La máquina ríe: \"¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...\"";
                break;
            case "GRITAR":
                accion = "La máquina grita: \"¡¡¡ALERTA DE STACK OVERFLOW!!!\"";
                break;
            case "SUSURRAR":
                accion = "La máquina susurra: \"Shhh... los bugs están dormidos.\"";
                break;
            case "ANALIZAR":
                accion = "La máquina procesa: \"Analizando datos... resultado: ¡Eres increíble programando!\"";
                break;
            default:
                accion = "Acción desconocida";
        }
        return accion;
    }




    public void ejecutarAccion(String nombre) {
        Runnable accion = acciones.get(nombre);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("-");
        }
    }
}
