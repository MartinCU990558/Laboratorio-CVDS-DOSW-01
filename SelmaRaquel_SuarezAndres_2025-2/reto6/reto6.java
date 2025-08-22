package SelmaRquel_SuarezAndres_2025.reto3;

import java.util.*;

public class Reto6 {

    private final Map<String, Runnable> comandos = new HashMap<>();

    public Reto6() {
        // Registrar acciones con lambdas
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