package Pareja_Ramirez_Guzman.Reto2_RamirezGuzman;

import java.util.*;

/**
 * Comprende al clasificador de los números.
 * Sean estos o correspondan estos al valor mínimo y/o máximo.
 */
public class NumberClassifier {
    private List<Integer> numbersToClassify;

    /**
     * Método constructor del 'clasificador de números'.
     * @param numbersToClassify
     */
    public NumberClassifier(List<Integer> numbersToClassify){
        this.numbersToClassify = numbersToClassify;
    }

    public Integer maxNumber(){
        return numbersToClassify.stream().max(Integer::compareTo).orElse(null);
    }

    public Integer minNumber(){
        return numbersToClassify.stream().min(Integer::compareTo).orElse(null);
    }

    public Integer quantityOfNumbers(){
        return numbersToClassify.size();
    }

    public boolean isMaxEven(){
        Integer max = maxNumber();
        return max != null && max % 2 == 0;
    }

    public boolean isMaxATwoDivisor(){
        Integer maxd = maxNumber();
        return maxd != null && maxd != 0 && 2 % maxd == 0;
    }

    public boolean isQuantityEven(){
        Integer quantity = quantityOfNumbers();
        return quantity != null && quantity % 2 == 0;
    }
}