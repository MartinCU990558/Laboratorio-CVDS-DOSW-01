package reto2;

public class Resultados {
    private int maximoLista1;
    private int minimoLista1;
    private int cantidadLista1;
    private boolean numeroMayorEsDivisorDeDosLista1;
    private boolean numeroMayorEsMultiploDeDosLista1;
    private boolean cantidadDatosParLista1;
    private boolean cantidadDatosImparLista1;

    private int maximoLista2;
    private int minimoLista2;
    private int cantidadLista2;
    private boolean numeroMayorEsDivisorDeDosLista2;
    private boolean numeroMayorEsMultiploDeDosLista2;
    private boolean cantidadDatosParLista2;
    private boolean cantidadDatosImparLista2;

    public Resultados(int maximoLista1, int minimoLista1, int cantidadLista1) {
        this.maximoLista1 = maximoLista1;
        this.minimoLista1 = minimoLista1;
        this.cantidadLista1 = cantidadLista1;
    }

    public Resultados(
        int maximoLista1, int minimoLista1, int cantidadLista1,
        boolean numeroMayorEsDivisorDeDosLista1, boolean numeroMayorEsMultiploDeDosLista1,
        boolean cantidadDatosParLista1, boolean cantidadDatosImparLista1,
        int maximoLista2, int minimoLista2, int cantidadLista2,
        boolean numeroMayorEsDivisorDeDosLista2, boolean numeroMayorEsMultiploDeDosLista2,
        boolean cantidadDatosParLista2, boolean cantidadDatosImparLista2
    ) {
        this.maximoLista1 = maximoLista1;
        this.minimoLista1 = minimoLista1;
        this.cantidadLista1 = cantidadLista1;
        this.numeroMayorEsDivisorDeDosLista1 = numeroMayorEsDivisorDeDosLista1;
        this.numeroMayorEsMultiploDeDosLista1 = numeroMayorEsMultiploDeDosLista1;
        this.cantidadDatosParLista1 = cantidadDatosParLista1;
        this.cantidadDatosImparLista1 = cantidadDatosImparLista1;

        this.maximoLista2 = maximoLista2;
        this.minimoLista2 = minimoLista2;
        this.cantidadLista2 = cantidadLista2;
        this.numeroMayorEsDivisorDeDosLista2 = numeroMayorEsDivisorDeDosLista2;
        this.numeroMayorEsMultiploDeDosLista2 = numeroMayorEsMultiploDeDosLista2;
        this.cantidadDatosParLista2 = cantidadDatosParLista2;
        this.cantidadDatosImparLista2 = cantidadDatosImparLista2;
    }

    @Override
    public String toString() {
        return "Resultados {\n" +
                "Lista1 -> maximo =" + maximoLista1 + ", minimo=" + minimoLista1 + ", cantidad=" + cantidadLista1 +
                ", mayorDivisorDe2 =" + numeroMayorEsDivisorDeDosLista1 +
                ", mayorMultiploDe2=" + numeroMayorEsMultiploDeDosLista1 +
                ", cantidadPar=" + cantidadDatosParLista1 +
                ", cantidadImpar=" + cantidadDatosImparLista1 + "\n" +
                "Lista2 -> maximo=" + maximoLista2 + ", minimo=" + minimoLista2 + ", cantidad=" + cantidadLista2 +
                ", mayorDivisorDe2=" + numeroMayorEsDivisorDeDosLista2 +
                ", mayorMultiploDe2=" + numeroMayorEsMultiploDeDosLista2 +
                ", cantidadPar=" + cantidadDatosParLista2 +
                ", cantidadImpar=" + cantidadDatosImparLista2 + "\n" +
                "}";
    }
}
