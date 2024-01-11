
public class Comida {
    private String nombre;
    private int precio;
    private String marca;

    public Comida() {
        this.nombre = "";
        this.precio = 0;
        this.marca = "";
    }
    public Comida(String nombre, int precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String imprimirDatos() {
        return   "Nombre         = " + nombre + 
               "\nPrecio         = " + precio + 
                "\nMarca          = " + marca;
    }
    
    
}
