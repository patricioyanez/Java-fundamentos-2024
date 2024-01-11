
public class Principal {
    public static void main(String[] args) {
        Saludable fruta = new Saludable();
        fruta.setNombre("Manzana");
        fruta.setMarca("Chilena");
        fruta.setPrecio(2500);
        fruta.setClasificacion("Fruta");
        fruta.setFibra(100);
        System.out.println(fruta.imprimirDatos());
        fruta.cocinar();
        
        Saludable reineta = new Saludable();
        reineta.setNombre("Reineta");
        reineta.setMarca("chinita");
        reineta.setPrecio(10000);
        reineta.setClasificacion("pescado");
        reineta.setFibra(400);
        System.out.println(reineta.imprimirDatos());
        reineta.cocinar();
        
        
        System.out.println("hola mundo".substring(5));
        System.out.println("hola mundo".substring(0,4));
        
        reineta.descuento();
        reineta.descuento(50);
    }
}
