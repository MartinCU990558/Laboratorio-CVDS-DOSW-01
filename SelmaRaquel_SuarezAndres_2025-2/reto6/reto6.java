package SelmaRquel_SuarezAndres_2025.reto6;

import java.util.*;

public class reto6 {

    private final Map<String, Runnable> comandos = new HashMap<>();

    public reto6() {

        registrar("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        registrar("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        registrar("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        registrar("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));

        registrar("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        registrar("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        registrar("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        registrar("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
    }

    private void registrar(String clave, Runnable accion) {
        comandos.put(clave, accion);
    }

    public void ejecutarComando(String cmd) {

        switch (cmd) {
            case "SALUDAR": case "DESPEDIR": case "CANTAR": case "DANZAR":
            case "BROMEAR": case "GRITAR": case "SUSURRAR": case "ANALIZAR":
                Optional.ofNullable(comandos.get(cmd)).ifPresent(Runnable::run);
                break;
            default:
                System.out.println("Comando no reconocido: " + cmd);
        }
    }

    public static void main(String[] args) {
        reto6 m = new reto6();

        List.of("SALUDAR","BROMEAR","ANALIZAR","DANZAR","DESPEDIR","GRITAR","SUSURRAR","CANTAR")
                .forEach(m::ejecutarComando);
    }
}
