package reto2;

public class Resultados { private int maximo; private int minimo; private int cantidad; private boolean numeroMayorEsDivisorDeDos; private boolean numeroMayorEsMultiploDeDos; private boolean cantidadDeDatosPar; private boolean cantidadDeDatosImpar; 
    public Resultados(int maximo, int minimo, int cantidad) {
         this.maximo = maximo; this.minimo = minimo; this.cantidad = cantidad; } 
    public Resultados( int maximo, int minimo, int cantidad, boolean numeroMayorEsDivisorDeDos, boolean numeroMayorEsMultiploDeDos, boolean cantidadDeDatosPar, boolean cantidadDeDatosImpar ) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad; 
        this.numeroMayorEsDivisorDeDos = numeroMayorEsDivisorDeDos; 
        this.numeroMayorEsMultiploDeDos = numeroMayorEsMultiploDeDos; 
        this.cantidadDeDatosPar = cantidadDeDatosPar; 
        this.cantidadDeDatosImpar = cantidadDeDatosImpar; } 
    public int getMaximo() { 
        return maximo; 
    } 
    public int getMinimo() {
        return minimo; 
    } 
    public int getCantidad() {
        return cantidad; 
    } 
    public boolean isNumeroMayorEsDivisorDeDos() {
        return numeroMayorEsDivisorDeDos; } 
    public boolean isNumeroMayorEsMultiploDeDos() {
        return numeroMayorEsMultiploDeDos; } 
    public boolean isCantidadDeDatosPar() {
        return cantidadDeDatosPar; } 
    public boolean isCantidadDeDatosImpar() {
        return cantidadDeDatosImpar; } 
    @Override public String toString() { 
        return "Resultados:" + "\n Máximo = " + maximo + "\n Mínimo = " + minimo + "\n Cantidad = " + cantidad + "\n Máximo es múltiplo de 2 = " + numeroMayorEsMultiploDeDos + "\n Máximo es divisor de 2 = " + numeroMayorEsDivisorDeDos + "\n Cantidad es par = " + cantidadDeDatosPar + "\n Cantidad es impar = " + cantidadDeDatosImpar; } 
    }