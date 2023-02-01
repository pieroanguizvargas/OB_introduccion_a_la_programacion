public class Main {
    public static void main(String[] args) {
        int resultado, resultado2;
        //Forma1
        Coche miCoche;
        miCoche = new Coche();

        resultado = suma(20, 30,10);
        System.out.println(resultado);

        resultado2 = miCoche.incrementarPuertas(1);
        System.out.println("Puertas " + resultado2);
    }
    public static int suma(int a, int b, int c) {

        return a + b + c;
    }
}