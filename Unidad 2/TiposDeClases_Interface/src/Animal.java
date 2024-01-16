
public abstract class Animal implements Operaciones{ // abstractos - final
    // clase enfocada para la herencia
    // no se puede instanciar
    String nombre;
    String edad;

    public String imprimir() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    // metodo abstracto. No tiene cuerpo o bloque
    public abstract void mover();
    
}
