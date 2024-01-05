package Principal;
import java.util.Scanner;


public class Principal5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
        int contador = 0;
        while(contador < numero)
        {
            System.out.println("contador: " + contador);
//            contador = contador +1;
//            contador += 1;
            contador++;
        }
        System.out.println("Termino del código");
    }
}
