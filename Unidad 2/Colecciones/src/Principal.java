import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // crear coleccion que soporta objetos String
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        //ArrayList<int> numeros;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        // agregar elemento
        nombres.add("Luis");
        
        // mostrar
        System.out.println("Nombre: " + nombres.get(0));
        
        // agregar más de un nombre
        nombres.add("Ana");
        nombres.add("Diego");
        nombres.add("Pedro");
        nombres.add("Adam");
        
        System.out.println("Nombre: " + nombres.get(1));
        System.out.println("Nombre: " + nombres.get(2));
        System.out.println("Nombre: " + nombres.get(3));
        System.out.println("Nombre: " + nombres.get(4));
        
        // recorre la colección
        for (String nombre : nombres) {
            System.out.println("Nombre for: " + nombre);
        }
        
        // ejercicio:
        /*
            agregar 10 numeros a la coleccion numeros y mostrar
            en la pantalla
        */
        numeros.add(20);
        numeros.add(30);
        numeros.add(200);
        numeros.add(50);
        numeros.add(120);
        numeros.add(205);
        numeros.add(1220);
        numeros.add(31);
        numeros.add(1);
        numeros.add(-80);
        
        for (Integer numero : numeros) {
            System.out.println("Numeros: " + numero);
        }
        
    }
}