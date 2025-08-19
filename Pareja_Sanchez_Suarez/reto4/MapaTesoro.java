package reto4;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MapaTesoro {
    HashMap<String, Integer> mapaRapido;
    Hashtable<String, Integer> mapaSeguro;

    public MapaTesoro() {
        mapaRapido = new HashMap<>();
        mapaSeguro = new Hashtable<>();
    }

    public  ArrayList<String> minerales(){
        return new ArrayList<>(List.of(
                "oro", "plata", "rubi", "esmeralda", "diamante"
        ));
    }


    public void adicionaRapido(String nome, int valor) {
        if(!mapaRapido.containsKey(nome)) {
            mapaRapido.put(nome, valor);
        }
    }

    public void adicionaSeguro(String nome, int valor) {
        if(!mapaSeguro.containsKey(nome)) {
            mapaSeguro.put(nome, valor);
        }
    }

    public void mayusRapido() {
        mapaRapido.forEach((clave, valor) ->
                System.out.println("Clave: " + clave.toUpperCase() + "|" + "Valor: " + valor));
    }


    public void ordenarSeguro(){
        this.mapaSeguro.keySet().
                stream().
                sorted().
                forEach(m ->  System.out.println("Clave: " + m + "|" + "Valor: " + mapaSeguro.get(m)));
    }




    public void ordenarMapa(){
        Map<String, Integer> mapaFinal = Stream.concat(
                        mapaSeguro.entrySet().stream(),
                        mapaRapido.entrySet().stream()).
                collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (viejo,nuevo ) -> viejo

                ));
        mapaFinal.keySet().
                stream().
                sorted().
                forEach(coso -> System.out.println("Clave: " + coso.toUpperCase() + "|" + "Valor: " + mapaFinal.get(coso)));
    }


}
