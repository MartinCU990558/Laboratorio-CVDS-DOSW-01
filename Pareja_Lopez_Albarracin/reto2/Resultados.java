package Pareja_Lopez_Albarracin.reto2;

public class Resultados {
    private int maximo, minimo, cantidad;
    private boolean mayorDivisorDe2;

    public Resultados(int maximo, int minimo, int cantidad, boolean mayorDivisorDe2) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
        this.mayorDivisorDe2 = mayorDivisorDe2;
    }

    public int getMaximo(){ return maximo; }
    public int getMinimo(){ return minimo; }
    public int getCantidad(){ return cantidad; }
    public boolean isMayorDivisorDe2(){ return mayorDivisorDe2; }

    @Override
    public String toString() {
        return "Resultados{" +
                "maximo=" + maximo +
                ", minimo=" + minimo +
                ", cantidad=" + cantidad +
                ", mayorDivisorDe2=" + mayorDivisorDe2 +
                '}';
    }
}
