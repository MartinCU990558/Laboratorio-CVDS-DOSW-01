package reto4;


import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Reto4 reto = new Reto4();
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("oro", 5);
        hashMap.put("plata", 3);
        hashMap.put("oro", 7);
        hashMap.put("diamante", 10);



        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("plata", 8);
        hashTable.put("rubí", 4);
        hashTable.put("oro", 12);
        hashTable.put("esmeralda", 6);

        HashMap<String, Integer> combinado = reto.superHashMap(hashTable, hashMap);

        combinado.forEach((llave, valor) -> System.out.println("CLAVE:" + llave + ", VALOR: " + valor));


    }




}
