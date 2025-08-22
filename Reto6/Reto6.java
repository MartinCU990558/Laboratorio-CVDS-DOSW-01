package Idarraga_Estupinan.Reto6;

public class Reto6 {

    public static void maquinaMisteriosa(String comando) {
        if (comando == null) {
            System.out.println("Comando vacío.");
            return;
        }

        switch (comando.toUpperCase()) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                break;

            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;

            case "SUSURRAR":
                System.out.println("Shhh... los bugs están dormidos.");
                break;

            case "ANALIZAR":
                System.out.println("Analizando datos... resultado: ¡Eres increíble programando!");
                break;

            default:
                System.out.println("Comando desconocido. Intenta: BROMEAR, GRITAR, SUSURRAR o ANALIZAR.");
        }
    }

}
