package reto2;

public class Resultados {
    private int maximo;
    private int minimo;
    private int cantidad;
<<<<<<< HEAD

    public Resultados(int maximo, int cantidad) {
=======
    public Resultados(int maximo,int minimo, int cantidad){
>>>>>>> feature/carril1_reto2_PuentesJuan_LopezNestor_2025-2
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Resultados:" +
                "maximo =" + " " + maximo +
                ", cantidad =" + " " + cantidad;
    }
}
=======
        
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
>>>>>>> feature/carril1_reto2_PuentesJuan_LopezNestor_2025-2
