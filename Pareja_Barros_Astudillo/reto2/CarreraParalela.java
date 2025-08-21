package Pareja_Barros_Astudillo.reto2;

import java.util.*;

public class CarreraParalela {
<<<<<<< HEAD
    public static int maximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).orElseThrow();
    }
}
=======
    public static String minimoYCantidad(List<Integer> numeros) {
        int min = numeros.stream().min(Integer::compare).orElseThrow();
        int cantidad = numeros.size();
        return "Minimo: " + min + ", Cantidad: " + cantidad;
    }
}
>>>>>>> feature/reto_carril_dos_BarrosSebastian_AstudilloCarlos_2025-2
