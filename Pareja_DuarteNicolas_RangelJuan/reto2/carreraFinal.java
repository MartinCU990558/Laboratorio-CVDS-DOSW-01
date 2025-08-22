package Pareja_DuarteNicolas_RangelJuan.reto2;

import java.util.List;

public class carreraFinal {

    public static class Resultado {
        private int maximo;
        private int minimo;
        private int cantidad;
        private boolean mayorMultiploDe2;
        private boolean mayorDivisorDe2;
        private boolean cantidadPar;
        private boolean cantidadImpar;

        public Resultado(int maximo, int minimo, int cantidad,
                         boolean mayorMultiploDe2, boolean mayorDivisorDe2,
                         boolean cantidadPar, boolean cantidadImpar) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
            this.mayorMultiploDe2 = mayorMultiploDe2;
            this.mayorDivisorDe2 = mayorDivisorDe2;
            this.cantidadPar = cantidadPar;
            this.cantidadImpar = cantidadImpar;
        }

        @Override
        public String toString() {
            return "Resultado {" +
                    "maximo=" + maximo +
                    ", minimo=" + minimo +
                    ", cantidad=" + cantidad +
                    ", mayorMultiploDe2=" + mayorMultiploDe2 +
                    ", mayorDivisorDe2=" + mayorDivisorDe2 +
                    ", cantidadPar=" + cantidadPar +
                    ", cantidadImpar=" + cantidadImpar +
                    '}';
        }
    }

    public static void calcularResultados(List<Integer> lista1, List<Integer> lista2) {
        Resultado r1 = analizarLista(lista1);
        Resultado r2 = analizarLista(lista2);

        System.out.println("Resultados de la lista 1: " + r1);
        System.out.println("Resultados de la lista 2: " + r2);
    }

    private static Resultado analizarLista(List<Integer> lista) {
        int max = lista.stream().max(Integer::compare).get();
        int min = lista.stream().min(Integer::compare).get();
        int cantidad = lista.size();

        boolean mayorMultiploDe2 = (max % 2 == 0) ? true : false;
        boolean mayorDivisorDe2 = (max != 0 && 2 % max == 0) ? true : false;
        boolean cantidadPar = (cantidad % 2 == 0) ? true : false;
        boolean cantidadImpar = (cantidad % 2 != 0) ? true : false;

        return new Resultado(max, min, cantidad,
                mayorMultiploDe2, mayorDivisorDe2,
                cantidadPar, cantidadImpar);
    }
}


