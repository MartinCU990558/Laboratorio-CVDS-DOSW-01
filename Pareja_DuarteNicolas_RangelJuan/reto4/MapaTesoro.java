package Pareja_DuarteNicolas_RangelJuan.reto4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapaTesoro {
    HashMap<String,Integer> mapaRapido;
    Hashtable<String,Integer> mapaLento;
    Map<String,Integer> mapaFinal;

    public MapaTesoro() {
        mapaRapido = new HashMap<>();
        mapaLento = new Hashtable<>();
    }

    public void agregarRapido(String  tesoro, int valor){
        if(!mapaRapido.containsKey(tesoro)){
            mapaRapido.put(tesoro, valor);
        }
    }

    public void agregarLento(String  tesoro, int valor){
        if(!mapaLento.containsKey(tesoro)){
            mapaLento.put(tesoro, valor);
        }
    }

    public Map<String,Integer> combinar() {
        mapaFinal = Stream.concat(mapaRapido.entrySet().stream(),
                        mapaLento.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v2
                ));
        return mapaFinal;
    }

    public void mostrar() {
        if (mapaFinal == null || mapaFinal.isEmpty()) {
            System.out.println("El mapa final está vacío. Usa combinar() primero.");
        } else {
            mapaFinal.keySet()
                    .stream()
                    .sorted()
                    .forEach(t->System.out.println("Clave: " + t.toUpperCase() + " | " + "Valor: " + mapaFinal.get(t)));
        }
    }
}

