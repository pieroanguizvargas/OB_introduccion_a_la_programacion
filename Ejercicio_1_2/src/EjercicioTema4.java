import java.util.Scanner;

public class EjercicioTema4 {
    public static void main(String[] args) {

        int numeroIf = 5, numeroWhile = -3, numeroWhile2 = -3;


        System.out.println("Ejecutando if");

        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es 0");
        }

        System.out.println("Ejecutando while");

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Ejecutnado do while");

        do {
            System.out.println(numeroWhile2);
            numeroWhile2++;
        } while (numeroWhile2 < 3);

        System.out.println("Ejecutnado for");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);

        }

        String estacion = "otoño";

        System.out.println("Ejecutando switch");

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;

            case "invierno":
                System.out.println("es invierno");
                break;

            case "primavera":
                System.out.println("es primavera");
                break;

            case "otoño":
                System.out.println("es otoño");
                break;

            default:
                System.out.println("no es una estación");
                break;
        }

        System.out.println("Ejecutando switch moderno");

        switch (estacion) {
            case "verano" -> System.out.println("Es verano");
            case "invierno" -> System.out.println("Es invierno");
            case "primavera" -> System.out.println("Es primavera");
            case "otoño" -> System.out.println("Es otoño");
            default -> System.out.println("No es una estación");
        }
    }
}

