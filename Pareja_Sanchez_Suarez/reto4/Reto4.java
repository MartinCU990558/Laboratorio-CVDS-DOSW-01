import reto4.MapaTesoro;

import java.util.ArrayList;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
        MapaTesoro mapa = new MapaTesoro();
        Random r = new Random();
        Random minerales = new Random();
        ArrayList<String > Minerals = mapa.minerales();


        int numeroMinerales1 = r.nextInt(10) + 1;
        int numeroMinerales2 = r.nextInt(10) + 1;

        for(int i = 0; i < numeroMinerales1; i++){
            int numero = r.nextInt(30) + 1;
            int mineral = r.nextInt(4) ;
            String mineralEs = Minerals.get(mineral);
            mapa.adicionaRapido(mineralEs,numero);

        }

        for(int i = 0; i < numeroMinerales2; i++){
            int numero = r.nextInt(30) + 1;
            int mineral = r.nextInt(4) ;
            String mineralEs = Minerals.get(mineral);
            mapa.adicionaSeguro(mineralEs,numero);

        }

        System.out.println("HashMap: ");
        mapa.mayusRapido();
        System.out.println("--------------------------------------");
        System.out.println("HashTable: ");
        mapa.ordenarSeguro();
        System.out.println("--------------------------------------");
        mapa.ordenarMapa();






    }
} 