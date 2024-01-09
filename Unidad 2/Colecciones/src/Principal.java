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
        
        // otros metodos
        
        boolean existe = numeros.contains(201);
        
        if(existe)
            System.out.println("El valor si existe");
        else
            System.out.println("El valor no existe");
        
        int indiceObjeto = nombres.indexOf("Pedro");
        
        System.out.println("El nombre está en el indice: " + indiceObjeto);
        
        // eliminar elemento
        boolean fueEliminado = nombres.remove("Pedro");
        
        if(fueEliminado)
            System.out.println("Pedro fue eliminado");
        else
            System.out.println("Pedro no se encontro");
        
        // mostrar la lista de nombres modificada
        System.out.println("\n\n");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
        
        nombres.remove(2);
        System.out.println("\n\n");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
        
        System.out.println("*** cantidad de elementos ****");
        System.out.println("La cantidad de nombres:" + nombres.size());
        System.out.println("La cantidad de numeros:" + numeros.size());
        
        /*
        Ejercicios: crear retina que permita ingresar x nombres
        y listarlos cuando el usuario lo determine.
        crear un menu para ambas acciones
        
        */
        
    }
}
