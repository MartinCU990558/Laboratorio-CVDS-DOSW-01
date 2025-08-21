package reto4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto4 {

    private HashMap<String, Integer> mapaParteRapida = new HashMap<>();


    public HashMap<String, Integer> almacenarMitadMapa(List<Map.Entry<String, Integer>> listaDePares) {         
        listaDePares.stream()
                .filter(par -> !mapaParteRapida.containsKey(par.getKey()))
                .forEach(par -> mapaParteRapida.put(par.getKey(), par.getValue()));

        return mapaParteRapida;
    }

    //comentario de prueba

}