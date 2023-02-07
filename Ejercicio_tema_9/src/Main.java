import java.sql.SQLOutput;
import java.util.SortedMap;

//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
public class Main {
    public static void main(String[] args) {
        System.out.println("Cliente");
        Cliente cliente = new Cliente();
        cliente.edad = 15;
        System.out.println(cliente.edad);
        cliente.nombre = "Maximiliano";
        System.out.println(cliente.nombre);
        cliente.telefono = 968202617;
        System.out.println(cliente.telefono);
        cliente.credito = 999;
        System.out.println(cliente.credito);

        System.out.println();

        System.out.println("Trabajador");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 20;
        System.out.println(trabajador.edad);
        trabajador.nombre = "Petrus";
        System.out.println(trabajador.nombre);
        trabajador.telefono = 968202616;
        System.out.println(trabajador.telefono);
        trabajador.salario = 2000;
        System.out.println(trabajador.salario);
    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}