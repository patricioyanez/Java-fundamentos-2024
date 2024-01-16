
public class Principal {
    public static void main(String[] args) {
        //Animal animalito = new Animal();
        Pez p = new Pez();
        
        p.nombre = "Reineta";
        p.especie= "pez gris";
        p.mover();
        
        Calculadora c = new Calculadora();
        c.numero1 = 10;
        c.numero2 = 15;
        c.sumar();
        
    }
}
