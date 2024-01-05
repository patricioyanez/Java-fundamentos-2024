
package Principal;

public class Principal4 {
    public static void main(String[] args) {
        int numero;
        numero = 500;        
        String nombre = "ana";        
        if (numero == 500)
        {
            System.out.println("Numero tiene el valor 500");
        }
        
        if (numero != 500)
        {
            System.out.println("No Es igual");
        }
        else
        {
            System.out.println("Es igual");
        }
        
        
        if (nombre.equals("Juan"))
        {
            System.out.println("el nombre es juan");
        }
        else if (nombre.equals("Diego"))
        {
            System.out.println("El nombre es diego");
        }
        else if (nombre.equals("ana"))
        {
            System.out.println("El nombre es Ana");
        }
        else
        {
            System.out.println("su nombre es: " + nombre);
        }
    }
}
