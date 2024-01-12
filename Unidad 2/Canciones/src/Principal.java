import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cancion> lista1 = new ArrayList<Cancion>();
        Cancion cancion1 = new Cancion("gasolina", "Daddy", 300, true, true);
        Cancion cancion2 = new Cancion("Compa", "Peso Pluma", 200, true, false);
        Cancion cancion3 = new Cancion("Bailando solo", "Bunkers", 360, false, false);
        
        lista1.add(cancion1);
        lista1.add(cancion2);
        lista1.add(cancion3);
        
        System.out.println("Lista de canciones");
        System.out.println("1.-" + cancion1.imprimir());
        System.out.println("2.-" + cancion2.imprimir());
        System.out.println("3.-" + cancion3.imprimir());
        System.out.print("Seleccione canción a reproducir: ");
        int opcion = leer.nextInt();
        
        System.out.println("Canción en reproducción");
        if(opcion == 1)
            System.out.println(cancion1.imprimir());
        else if(opcion == 2)
            System.out.println(cancion2.imprimir());
        else if(opcion == 3)
            System.out.println(cancion3.imprimir());
        else
            System.out.println("No existe esa opción");
    }
}
