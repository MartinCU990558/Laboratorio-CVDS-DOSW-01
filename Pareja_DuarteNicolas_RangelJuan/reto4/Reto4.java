package Pareja_DuarteNicolas_RangelJuan.reto4;

public class Reto4 {
    public static void main(String[] args) {
        MapaTesoro mapa = new MapaTesoro();

        mapa.agregarRapido( "Oro",5);
        mapa.agregarRapido("Plata",3);
        mapa.agregarRapido("Oro",7);
        mapa.agregarRapido( "Diamante",10);
        mapa.agregarLento( "Plata",8);
        mapa.agregarLento( "Rubi",4);
        mapa.agregarLento( "Oro",12);
        mapa.agregarLento( "Esmeralda",6);

        mapa.combinar();
        mapa.mostrar();
    }
}
