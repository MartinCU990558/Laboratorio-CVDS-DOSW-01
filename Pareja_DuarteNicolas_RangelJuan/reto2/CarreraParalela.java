import java.util.*;
import java.util.stream.*;

public class CarreraParalela {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 10, 2, 8, 15);

        Resultados res = calcularResultados(numeros);
        System.out.println(res);
    }

    public static int calcularMinimo(List<Integer> lista) {
        return lista.stream().min(Integer::compare);
    }

    public static Resultados calcularResultados(List<Integer> lista) {
        int min = lista.stream().min(Integer::compare);
        int cantidad = lista.size();
        int max = lista.stream().max(Integer::compare);

        String divisor = (2 % max == 0) ? "Sí" : "No";
        String impar = (cantidad % 2 != 0) ? "Sí" : "No";

        return new Resultados(min, cantidad, divisor, impar);
    }
}

class Resultados {
    int minimo;
    int cantidad;
    String maxEsDivisorDeDos;
    String cantidadEsImpar;

    public Resultados(int minimo, int cantidad, String maxEsDivisorDeDos, String cantidadEsImpar) {
        this.minimo = minimo;
        this.cantidad = cantidad;
        this.maxEsDivisorDeDos = maxEsDivisorDeDos;
        this.cantidadEsImpar = cantidadEsImpar;
    }

    @Override
    public String toString() {
        return "Mínimo: " + minimo +
               ", Cantidad: " + cantidad +
               ", ¿Mayor divisor de 2?: " + maxEsDivisorDeDos +
               ", ¿Cantidad impar?: " + cantidadEsImpar;
    }
}