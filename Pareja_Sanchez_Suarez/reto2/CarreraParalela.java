import java.util.ArrayList;

public class CarreraParalela {

    private int[] numeroPequeño(ArrayList<Integer> arry){
        int[] numeros = new int[2];
        int a = 0;
        if(arry.size() != 0){
            a = arry.stream().min(Integer::compare).get();
        }
        numeros[0] = a;
        numeros[1] = arry.size();
        return  numeros;
    }
    private boolean divisor2(int a){
        return (2 % a == 0) ? true : false;
    }

    private boolean datosImpar(ArrayList<Integer> arry){
        return !multiplo2(arry.size());

    }
    public static void main(String[] args) {
    }
}
