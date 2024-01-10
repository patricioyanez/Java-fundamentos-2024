
import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        String opcion = "s";
        // menu
        while(!opcion.equalsIgnoreCase("s"))
        {
            System.out.println("***** === Menú === ******");
            System.out.println("1.- Ingreso de nombre");
            System.out.println("2.- Listar nombres");
            System.out.println("S.- Para salir");
            System.out.print("Ingrese opción: ");
            opcion = leer.next();
            
            if(opcion.equals("1"))
            {
                
            }
        }
        
    }
}
