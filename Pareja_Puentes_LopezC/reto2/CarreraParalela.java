package reto2;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.print.attribute.standard.NumberOfDocuments;

public class CarreraParalela {
    
    static int maximoNumero(List<Integer> numeros){
        return numeros.stream().max(Integer::compare).get();
    }
    
    static int numeroMinimoCantidad(List<Integer> numeros){
        return numeros.stream().min(Integer::compare).get();
    }

    static int cantidadNumeros(List<Integer> numeros) {
        return (int) numeros.stream().count();
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