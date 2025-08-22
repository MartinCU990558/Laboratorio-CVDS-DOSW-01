package reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reto4 {

    private HashMap<String, Integer> mapaParteRapida = new HashMap<>();
    private Hashtable<String, Integer> mapaParteLenta = new Hashtable<>();
    private HashMap<String, Integer> combinado = new HashMap<>();


    public HashMap<String, Integer> almacenarMitadMapa(List<Map.Entry<String, Integer>> listaDePares) {
        listaDePares.stream()
                .filter(par -> !mapaParteRapida.containsKey(par.getKey()))
                .forEach(par -> mapaParteRapida.put(par.getKey(), par.getValue()));

        return mapaParteRapida;
    }

    public Hashtable<String, Integer> almacenarMitadMapaHashTable(List<Map.Entry<String, Integer>> listaDePares) {
        listaDePares.stream()
                .filter(par -> !mapaParteRapida.containsKey(par.getKey()))
                .forEach(par -> mapaParteRapida.put(par.getKey(), par.getValue()));

        return mapaParteLenta;
    }


    public HashMap<String, Integer> combinarHasTableYHashMap(Hashtable<String, Integer> mapaHashTable, HashMap<String, Integer> mapaHashMap) {
        mapaHashMap.forEach(combinado::put);
        mapaHashTable.forEach(combinado::put);


        return combinado;
    }

}