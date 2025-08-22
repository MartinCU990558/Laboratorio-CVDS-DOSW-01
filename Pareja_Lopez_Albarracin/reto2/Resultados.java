package Pareja_Lopez_Albarracin.reto2;

public class Resultados {
    private int maximo, minimo, cantidad;
    private boolean mayorMultiploDe2, mayorDivisorDe2;
    private boolean cantidadPar, cantidadImpar;

    public Resultados(int maximo, int minimo, int cantidad,
                      boolean mayorMultiploDe2, boolean mayorDivisorDe2,
                      boolean cantidadPar, boolean cantidadImpar) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
        this.mayorMultiploDe2 = mayorMultiploDe2;
        this.mayorDivisorDe2  = mayorDivisorDe2;
        this.cantidadPar      = cantidadPar;
        this.cantidadImpar    = cantidadImpar;
    }

    public int getMaximo(){ return maximo; }
    public int getMinimo(){ return minimo; }
    public int getCantidad(){ return cantidad; }
    public boolean isMayorMultiploDe2(){ return mayorMultiploDe2; }
    public boolean isMayorDivisorDe2(){ return mayorDivisorDe2; }
    public boolean isCantidadPar(){ return cantidadPar; }
    public boolean isCantidadImpar(){ return cantidadImpar; }

    @Override
    public String toString() {
        return "Resultados{" +
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
