package Pareja_Castiblanco_Leal.reto4;

import java.util.Hashtable;
import java.util.List;

public class Reto4 {
    public static Hashtable<String, Integer> mapaSinDuplicados(List<String> claves, List<Integer> valores) {
        Hashtable<String, Integer> mapa = new Hashtable<>();

        for (int i = 0; i < claves.size(); i++) {
            String clave = claves.get(i);
            Integer valor = valores.get(i);

            if (!mapa.containsKey(clave)) {
                mapa.put(clave, valor);
            }
        }

        return mapa;
    }

    public static void imprimirMapa(Hashtable<String, Integer> mapa) {
        mapa.entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .forEach(System.out::println);
    }



    public static void main(String[] args) {
        List<String> claves = List.of("DOSW", "AYSR", "PTIA", "AYSR", "COMP");
        List<Integer> valores = List.of(1, 3, 5, 7, 9);

        if (claves.size() != valores.size()) {
            System.out.println("La cantidad de claves no coincide con la cantidad de valores");
        } else {
            Hashtable<String, Integer> mapa = mapaSinDuplicados(claves, valores);
            imprimirMapa(mapa);
        }
    }
}