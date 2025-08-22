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

    public HashMap<String, Integer> convertirClavesAMayusculas(HashMap<String, Integer> combinadoToUpperCase){
        return combinadoToUpperCase.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));


    }

    public HashMap<String, Integer> organizarClavesAscendente(HashMap<String, Integer> combinadoToUpperCase) {
        return combinadoToUpperCase.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new
                ));
    }

    public HashMap<String, Integer> superHashMap(Hashtable<String, Integer> tabla, HashMap<String, Integer> mapa) {
        HashMap<String, Integer> combinado = combinarHasTableYHashMap(tabla, mapa);
        HashMap<String, Integer> combinadoToUpperCase = convertirClavesAMayusculas(combinado);
        HashMap<String, Integer> hashMapFinal = organizarClavesAscendente(combinadoToUpperCase);

        return hashMapFinal;
    }

}