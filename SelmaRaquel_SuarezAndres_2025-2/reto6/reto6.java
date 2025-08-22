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
