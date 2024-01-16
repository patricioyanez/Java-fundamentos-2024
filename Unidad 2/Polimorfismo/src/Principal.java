import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Pez atun = new Pez();
        Ave pollo = new Ave();
        
        
        animal.mover();
        atun.mover();
        pollo.mover();
        
        Animal animal1 = new Pez();
        Animal animal2 = new Ave();
        // crear coleccion
        ArrayList<Animal> animales;
        animales = new ArrayList<Animal>();
        // agregar animal y sus subclases
        animales.add(animal);
        animales.add(atun);
        animales.add(pollo);
        
        System.out.println("\n\n*** animales en colección ***");
        for (Animal a : animales) {
            a.mover();
        }
        
        /* Ejercicio:
            2.2.2 en github
        */
    }
}
