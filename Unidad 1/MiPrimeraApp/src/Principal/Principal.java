package Principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args)
    {
        System.out.println("Hola Mundo");
        // sout + tab
        System.out.println("fadgadfgdfg");
        
        // Para leer teclado: crear objeto
        Scanner leerTeclado = new Scanner(System.in);
        
        //solicitar datos al usuario
        System.out.println("Ingrese su nombre:");
        String nombre = leerTeclado.next();
        
        System.out.println("Hola " + nombre);
        
        // BREAK 15'
        
        // Ejercicio:
        
        /*
            Crear una clase que permita guardar los siguientes datos:
            rut, digito verificador, nombre, apellido, correo, dirección
            año ingreso, sueldo, si es chileno.
        
        */
        
    }
}
