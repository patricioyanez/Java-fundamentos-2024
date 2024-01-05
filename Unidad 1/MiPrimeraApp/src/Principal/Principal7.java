package Principal;

public class Principal7 {
    public static void main(String[] args) {
        int numero = 500;
        String nombre = "   Juan  ";
        
        System.out.println("contar  : " + nombre.length() );
        System.out.println("trim    : " + nombre );
        System.out.println("trim    : " + nombre.trim() );
        System.out.println("char at : " + nombre.charAt(4));
        nombre = nombre.trim();
        System.out.println("nombre  :" + nombre);
        
        System.out.println("Mayúscula : " + nombre.toUpperCase());
        System.out.println("Minúscula : " + nombre.toLowerCase());
        
        String rut = "20100300-K";
        
    }
}
