import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

public class CarreraParalela {
    private int numeroGrande(ArrayList<Integer> arry){
        int a = 0;
        if(arry.size() != 0){
             a = arry.stream().max(Integer::compare).get();
        }
        return  a;
    }




    private int[] ambosJuntos(ArrayList<Integer> arry){
        int[] numeros = new int[3];
        numeros[0] = numeroGrande(arry);
        numeros[1] = numeroPequeño(arry)[0];
        numeros[2] = numeroPequeño(arry)[1];
        return  numeros;
    }

    private boolean multiplo2(int a){
        return (a % 2 == 0) ? true : false;
    }
    

    public static void main(String[] args) {


    }
}
