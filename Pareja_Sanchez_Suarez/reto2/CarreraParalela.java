import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CarreraParalela {

    private int numeroGrande(ArrayList<Integer> arry){
        int a = 0;
        if(arry.size() != 0){
            a = arry.stream().max(Integer::compare).get();
        }
        return  a;
    }

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

    private boolean multiplo2(int a){
        return (a % 2 == 0);
    }

    private boolean datosPar(ArrayList<Integer> arry){
        return multiplo2(arry.size());
    }

    private boolean divisor2(int a){
        return (2 % a == 0);
    }

    private boolean datosImpar(ArrayList<Integer> arry){
        return !multiplo2(arry.size());
    }

    private int[] ambosJuntos(ArrayList<Integer> arry){
        int[] numeros = new int[3];
        numeros[0] = numeroGrande(arry);
        numeros[1] = numeroPequeño(arry)[0];
        numeros[2] = numeroPequeño(arry)[1];
        return  numeros;
    }


    private ArrayList<String> resultado(ArrayList<Integer> arry){
        ArrayList<String> resultado = new ArrayList<>();
        int[] numeros = ambosJuntos(arry);
        int t = numeros[0];
        for(int i : numeros){
            resultado.add(String.valueOf(i));
        }
        resultado.add(Boolean.toString(multiplo2(t)));
        resultado.add(Boolean.toString(divisor2(t)));
        resultado.add(Boolean.toString(datosPar(arry)));


        return resultado;
    }

    private ArrayList<String> mensajes(){
        ArrayList<String> mensajes = new ArrayList<>();
        mensajes.add("Numero mayor: ");
        mensajes.add("Numero menor: ");
        mensajes.add("Cantidad de elementos:");
        mensajes.add("Es multiplo de 2 el mayor: ");
        mensajes.add("Es divisible entre 2 el mayor: ");
        mensajes.add("La cantidad de elementos es par: ");
        return mensajes;
    }

    private void resultadoFinal(ArrayList<Integer> arry, ArrayList<Integer> arry2){
        ArrayList<String> mensajes = mensajes();
        ArrayList<String> resultado1 = resultado(arry);
        ArrayList<String> resultado2 = resultado(arry2);

        IntStream.range(0, mensajes.size())
                .forEach(i -> System.out.println(mensajes.get(i) + resultado1.get(i)));
        System.out.println("--------------------------");

        IntStream.range(0, mensajes.size())
                .forEach(i -> System.out.println(mensajes.get(i) + resultado2.get(i)));

    }



    public static void main(String[] args) {
        Random r = new Random();

        CarreraParalela cp = new CarreraParalela();


        int num = r.nextInt(10) + 1;
        ArrayList<Integer> arry = new ArrayList<>();
        ArrayList<Integer> arry2 = new ArrayList<>();

        for(int i = 0; i < num; i++){
            arry.add(r.nextInt(10) + 1);
            arry2.add(r.nextInt(10) + 1);
        }

        cp.resultadoFinal(arry,arry2);

    }
}
