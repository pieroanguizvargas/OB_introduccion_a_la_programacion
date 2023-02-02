//Para practicar la encapsulación:
//Crear clase Persona.
//Crear las variables privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad("23");
        System.out.println(persona.getEdad());

        persona.setNombre("Maximiliano");
        System.out.println(persona.getNombre());

        persona.setTelefono(968202617);
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private String edad;
    private String nombre;
    private int telefono;

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}