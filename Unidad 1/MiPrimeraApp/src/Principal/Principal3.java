package Principal;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("**** Ingreso de datos 1ra persona *****");
        System.out.print("Ingrese el rut        : ");
        int rut = leer.nextInt();
        persona1.setRut(rut);
 
        System.out.print("Ingrese el dv         : ");
        String dv = leer.next();
        persona1.setDv(dv);
        
        System.out.print("Ingrese el nombre     : ");
        String nombre = leer.next();
        persona1.setNombre(nombre);
        
        System.out.print("Ingrese el apellido   : ");
        String apellido = leer.next();
        persona1.setApellido(apellido);  
        
        System.out.print("Ingrese el correo     : ");
        String correo = leer.next();
        persona1.setCorreo(correo);    
        
        System.out.print("Ingrese el dirección  : ");
        String direccion = leer.next();
        persona1.setDireccion(direccion); 
        
        System.out.print("Ingrese año de ingreso: ");
        int anio = leer.nextInt();
        persona1.setAnioIngreso(anio);
        
        System.out.print("Ingrese el sueldo     : ");
        int sueldo = leer.nextInt();
        persona1.setSueldo(sueldo);
        
        System.out.print("Es Chileno true/false : ");
        boolean esChileno = leer.nextBoolean();
        persona1.setEsChileno(esChileno);
        
        System.out.println("Datos Ingresados");
        System.out.println(persona1);
        
        System.out.println("Rut         : " + persona1.getRut() +"-" + persona1.getDv() );
        System.out.println("Nombre      : " + persona1.getNombre());
        System.out.println("Apellido    : " + persona1.getApellido());
        
        
        System.out.println("Rut         : " + persona2.getRut() +"-" + persona1.getDv() );
        System.out.println("Nombre      : " + persona2.getNombre());
        System.out.println("Apellido    : " + persona2.getApellido());
        
        System.out.println("*** Datos persona usando método **** ");
        System.out.println(persona1.imprimirDatos());
    }
}
