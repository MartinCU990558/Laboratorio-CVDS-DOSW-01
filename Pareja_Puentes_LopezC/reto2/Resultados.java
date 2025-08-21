package reto2;

public class Resultados {
    private int maximo;
    private int minimo;
    private int cantidad;

    public Resultados(int maximo,int minimo, int cantidad) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }
        
    public int getMaximo() { 
        return maximo;
     }
    public int getMinimo() { 
        return minimo; 
    }
    public int getCantidad() { 
        return cantidad;
     }
        @Override
    public String toString() {
        return "Resultados:" +
                "maximo =" + " " + maximo +
                ", minimo =" + " " + minimo +
                ", cantidad =" + " " + cantidad;
    }

    }
