
public class Saludable extends Comida
{
    private double fibra;
    private String clasificacion; // fruta, verdura, carnes blancas, etc.

    public Saludable() {
        this.fibra = fibra;
        this.clasificacion = clasificacion;
    }
    
    public Saludable(double fibra, String clasificacion, String nombre, int precio, String marca) {
        super(nombre, precio, marca);
        this.fibra = fibra;
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public double getFibra() {
        return fibra;
    }

    public void setFibra(double fibra) {
        this.fibra = fibra;
    }

    public String imprimirDatos() {
        return super.imprimirDatos() +               
              "\nFibra          = " + fibra + 
              "\nClasificación  = " + clasificacion;
    }

    @Override /// sobre escritura
    public void cocinar() {
        if(this.clasificacion.equalsIgnoreCase("Fruta"))
            System.out.println("No es necesario cocinar");
        else if(this.clasificacion.equalsIgnoreCase("pescado"))
            System.out.println("Cocinar al menos 5 minutos");
        
        
        //"fasdfads".subst
    }
    
    
    // sobre carga
    public void descuento()
    {
        double descuento = super.getPrecio() * .9;
        System.out.println("El descuento es: " + descuento);
    }
    public void descuento(int cantidadDescuento)
    {
        double porcentaje = (super.getPrecio() * cantidadDescuento)/100;
        double descuento = super.getPrecio() - porcentaje;
        System.out.println("El descuento es: " + descuento);
    }
    
    
    
    
}
