package Idarraga_Estupinan.Reto2;

import java.util.List;

public class CarreraParalela {

    public int calcularMaximo(List<Integer> numeros) {
        return numeros.stream().max(Integer::compare).get();
    }
}
