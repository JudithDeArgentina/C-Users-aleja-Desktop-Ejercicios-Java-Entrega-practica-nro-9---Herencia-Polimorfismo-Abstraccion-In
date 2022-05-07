// Crea una clase Persona con las siguientes variables:
// -La edad
// -El nombre
// -El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main{

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nombre = "Juan Ignacio";
        cliente.edad = 25;
        cliente.telefono = 1122334455;
        cliente.credito = 100000;
        System.out.println("Mi nombre es: " +(cliente.nombre));
        System.out.println("Mi edad es: " +(cliente.edad) + " " + "años");
        System.out.println("Mi telefono es: " +(cliente.telefono));
        System.out.println("Tengo este credito: " +(cliente.credito));
        
        System.out.println();

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Maria Eugenia";
        trabajador.edad = 32;
        trabajador.telefono = 1199887766;
        trabajador.salario = 1500000;
        System.out.println("Mi nombre es: " +(trabajador.nombre));
        System.out.println("Mi edad es: " +(trabajador.edad) + " " + "años");
        System.out.println("Mi telefono es: " +(trabajador.telefono));
        System.out.println("Mi salario es: " +(trabajador.salario));
    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}