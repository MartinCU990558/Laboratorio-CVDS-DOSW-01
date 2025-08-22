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


    static Resultados combinacion(List<Integer> numeros) {
        int maximo = maximoNumero(numeros);
        int minimo = numeroMinimoCantidad(numeros);
        int cantidad = cantidadNumeros(numeros);
        return new Resultados(maximo, minimo, cantidad);
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}