package reto2;
import java.util.Arrays;
import java.util.List;
public class CarreraParalela {

    static int maximoNumero(List<Integer> numeros){
        return numeros.stream().max(Integer::compare).get();
    }

    static int cantidadNumeros(List<Integer> numeros) {
        return (int) numeros.stream().count();
    }
    
    static int numeroMinimoCantidad(List<Integer> numeros){
        return numeros.stream().min(Integer::compare).get();
    }

    static boolean numeroMayorEsDivisorDe2(int numero) {
        return 2 % numero == 0 ? true : false;
    }

    static boolean multiplodedos(int maximo){
        if (maximo % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean cantidadEsPar(int numero) {
        return (numero % 2 == 0) ? true : false;
    }

    static boolean calcularCantidadImpar(int cantidad){
        return cantidad % 2 != 0 ? true : false;
    }

    static Resultados combinacion(List<Integer> numeros) {
        int maximo = maximoNumero(numeros);
        int minimo = numeroMinimoCantidad(numeros);
        int cantidad = cantidadNumeros(numeros);
        return new Resultados(maximo, minimo, cantidad);
    }

    static Resultados combinacion(List<Integer> lista1, List<Integer> lista2) {
        
        int numeroMayorLista1 = maximoNumero(lista1);
        int numeroMenorLista1 = numeroMinimoCantidad(lista1);
        int cantidadLista1 = cantidadNumeros(lista1);
        boolean numeroMayorEsDivisorDe2Lista1 = numeroMayorEsDivisorDe2(numeroMayorLista1);
        boolean numeroMayorEsMultiploDeDosLista1 = multiplodedos(numeroMayorLista1);
        boolean cantidadDeDatosEsParLista1 = cantidadEsPar(cantidadLista1);
        boolean cantidadDeDatosEsImparLista1 = calcularCantidadImpar(cantidadLista1);

        int numeroMayorLista2 = maximoNumero(lista2);
        int numeroMenorLista2 = numeroMinimoCantidad(lista2);
        int cantidadLista2 = cantidadNumeros(lista2);
        boolean numeroMayorEsDivisorDe2Lista2 = numeroMayorEsDivisorDe2(numeroMayorLista2);
        boolean numeroMayorEsMultiploDeDosLista2 = multiplodedos(numeroMayorLista2);
        boolean cantidadDeDatosEsParLista2 = cantidadEsPar(cantidadLista2);
        boolean cantidadDeDatosEsImparLista2 = calcularCantidadImpar(cantidadLista2);

        return new Resultados(
            numeroMayorLista1, numeroMenorLista1, cantidadLista1,
            numeroMayorEsDivisorDe2Lista1, numeroMayorEsMultiploDeDosLista1,
            cantidadDeDatosEsParLista1, cantidadDeDatosEsImparLista1,
            numeroMayorLista2, numeroMenorLista2, cantidadLista2,
            numeroMayorEsDivisorDe2Lista2, numeroMayorEsMultiploDeDosLista2,
            cantidadDeDatosEsParLista2, cantidadDeDatosEsImparLista2
        );
    }

    public static void main(String[] args) {
        
        List<Integer> lista1 = Arrays.asList(3, 8, 15, 2, 10);
        List<Integer> lista2 = Arrays.asList(7, 4, 12, 9, 6, 1);

        Resultados resultados = combinacion(lista1, lista2);

        System.out.println(resultados);
    }
}