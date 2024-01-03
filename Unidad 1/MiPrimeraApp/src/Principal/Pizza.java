package Principal;

public class Pizza {
    // 1.- Atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    // 2.- Constructores
        // sin parametros
    public Pizza() {
        this.nombre = "";
        this.tamano = "individual";
        this.masa = "";
        this.precio = 3000;
    }
    
        // con parametros
    public Pizza(String nombre, String tamano, String masa, int precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
    }
    
    // 3.- Accesadores y mutadores get set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // 4.- Métodos personalizados
    public void agregarValorEnvio()
    {
        this.precio = this.precio + 3000;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tamano=" + tamano + ", masa=" + masa + ", precio=" + precio + '}';
    }
    
}
