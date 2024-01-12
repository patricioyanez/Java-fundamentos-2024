import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
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
    }
}
