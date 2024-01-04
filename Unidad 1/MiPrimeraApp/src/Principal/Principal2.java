
package Principal;


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
    }
}
