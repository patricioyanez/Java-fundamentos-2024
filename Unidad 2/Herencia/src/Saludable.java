
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
                "Fibra          = " + fibra + 
              "\nClasificación  = " + clasificacion;
    }
    
    
    
    
}
