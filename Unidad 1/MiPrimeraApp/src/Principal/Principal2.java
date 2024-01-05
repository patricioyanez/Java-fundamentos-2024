
package Principal;

import java.util.Scanner;


public class Principal2 {
    public static void main(String[] args) {
        System.out.println("*** Crear objetos ***");
        
        int numero = 500;
        String nombre = "juan";
        boolean existeElemento = false;
        
        Pizza pizza1;
        pizza1 = new Pizza(); // crea un objeto
        
        Pizza pizza2 = new Pizza(); // crea un objeto (constructor sin parametros)
        
        // crea un objeto usando el constructor con parametros
        Pizza pizza3 = new Pizza("Pollo BBQ", "Familiar", "Delgada", 20000);
        
        System.out.println("Pizza 1: " + pizza1);
        System.out.println("Pizza 2: " + pizza2);
        System.out.println("Pizza 3: " + pizza3);
        
        
        // uso de mutadores y accesadores (getter and setter)
        pizza1.setNombre("Vegetariana");
        pizza1.setMasa("a la piedra");
        pizza1.setPrecio(7000);
        System.out.println("**** pizza 1 con datos agregados *****");
        System.out.println("Pizza 1: " + pizza1);
        
        System.out.println("\n\nEl nombre de la pizza 3 es: " + 
                                pizza3.getNombre() );
        
        // solicitar datos al usuario y agregarlo al objeto
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\n\n**** Ingrese nombre de pizza 2: ");
        String nombrePizza = leer.next();
        pizza2.setNombre(nombrePizza);
        
        System.out.print("**** Ingrese tamaño de pizza 2: ");
        String masa = leer.next();
        pizza2.setMasa(masa);      
        
        System.out.println("Datos pizza 2:" + pizza2);
        /*
        Ejercicio:
        Crear 2 personas y solicitar los datos al usuario para 
        completar ambos objetos y mostrar todos los datos en la 
        consola.
        
        tarea: leer ppt 1.1.1, 1.2.1 y 1.3.1
        */
    }
}
