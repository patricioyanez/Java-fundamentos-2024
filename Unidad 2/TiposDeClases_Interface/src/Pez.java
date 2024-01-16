
public class Pez extends Animal implements Operaciones{
    boolean esComestible;
    String especie;

    @Override
    public void mover() {
        System.out.println("El pez: " + nombre + ", esta nadando");
    }

    @Override
    public int guardar() {
        System.out.println("Datos guardados");
        return 1;
    }

    @Override
    public boolean existe() {
        System.out.println("datos existen");
        return true;
    }

    @Override
    public boolean eliminar() {
        System.out.println("Datos eliminados");
        return true;
    }

    @Override
    public void limpiar() {
        this.edad = "";
        this.esComestible = false;
        this.especie = "";
        this.nombre = "";
    }
    
    
}
