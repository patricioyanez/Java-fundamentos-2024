
public class Musica extends Usuario{
    private boolean esPlanGratuito;

    public Musica() {
        super();
        this.esPlanGratuito = true;
    }
    public Musica(boolean esPlanGratuito, String usuario, String clave, int tiempoConectado, String nombreRecurso) {
        super(usuario, clave, tiempoConectado, nombreRecurso);
        this.esPlanGratuito = esPlanGratuito;
    }

    public boolean getDuracion() {
        return esPlanGratuito;
    }

    public void setDuracion(boolean esPlanGratuito) {
        this.esPlanGratuito = esPlanGratuito;
    }

    @Override
    public String imprimir() {
        return super.imprimir() + "\nPlan Gratuito     = " + (esPlanGratuito?"si":"no");
    }
    
    
}
