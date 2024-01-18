
public class Streaming  extends Usuario{
    private int temporada;
    private int capitulo;

    public Streaming() {
        this.temporada = temporada;
        this.capitulo = capitulo;
    }

    public Streaming(int temporada, int capitulo, String usuario, String clave, int tiempoConectado, String nombreRecurso) {
        super(usuario, clave, tiempoConectado, nombreRecurso);
        this.temporada = temporada;
        this.capitulo = capitulo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
                "\nTemporada    = " + temporada + 
                "\nCapitulo     =" + capitulo;
    }
    
    
}
