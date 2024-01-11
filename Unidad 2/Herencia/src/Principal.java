
public class Principal {
    public static void main(String[] args) {
        Saludable fruta = new Saludable();
        fruta.setNombre("Manzana");
        fruta.setMarca("Chilena");
        fruta.setPrecio(2500);
        
        System.out.println(fruta.imprimirDatos());
    }
}
