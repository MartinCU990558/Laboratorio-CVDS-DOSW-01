package reto2;
import java.util.List;
import reto2.Resultados;
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
    static boolean esMultiploDeDos(int numero) {
    return (numero % 2 == 0) ? true : false;
    }
    static boolean cantidadEsPar(List<Integer> numeros) {
    return (numeros.size() % 2 == 0) ? true : false;
    }
    
    static boolean calcularCantidadImpar(int cantidad){
        return cantidad % 2 != 0 ? true : false;
    }

    static Resultados combinacion(List<Integer> numeros) {
        int maximo = maximoNumero(numeros);
        int minimo = numeroMinimoCantidad(numeros);
        int cantidad = cantidadNumeros(numeros);
        boolean esMultiplo = esMultiploDeDos(maximo);
        boolean esDivisor = numeroMayorEsDivisorDe2(maximo);
        boolean esPar = cantidadEsPar(numeros);
        boolean esImpar = calcularCantidadImpar(cantidad);
        return new Resultados(maximo, minimo, cantidad, esDivisor, esMultiplo, esPar, esImpar);
    }

    public static void main(String[] args) {
    List<Integer> lista1 = List.of(10, 20, 30, 40);
    List<Integer> lista2 = List.of(3, 5, 7, 9, 11);
    Resultados resultadosLista1 = combinacion(lista1);
    Resultados resultadosLista2 = combinacion(lista2);
    System.out.println("Resultados de la Lista 1:");
    System.out.println(resultadosLista1);
    System.out.println("\nResultados de la Lista 2:");
    System.out.println(resultadosLista2);
    }

}