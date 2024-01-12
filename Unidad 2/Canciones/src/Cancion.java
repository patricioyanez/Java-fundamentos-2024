
public class Cancion {
    // atributos, constructores, g and s y metodos personalizados customer
    private String titulo;
    private String artista;
    private int tiempoDuracion;
    private boolean esFavorito;
    private boolean fueDescargada;

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.tiempoDuracion = 0;
        this.esFavorito = false;
        this.fueDescargada = false;
    }
    public Cancion(String titulo, String artista, int tiempoDuracion, boolean esFavorito, boolean fueDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.esFavorito = esFavorito;
        this.fueDescargada = fueDescargada;
    }

    public boolean isFueDescargada() {
        return fueDescargada;
    }

    public void setFueDescargada(boolean fueDescargada) {
        this.fueDescargada = fueDescargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isEsFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }


    public String imprimir() {
        return "*** Cancion ***" + 
                "\nTitulo           = " + titulo + 
                "\nArtista          = " + artista + 
                "\nTiempo Duración  = " + tiempoDuracion + 
                "\nEs Favorito      = " + (esFavorito?"Si":"No") + 
                "\nFue Descargada   = " + (fueDescargada?"Si":"No");
    }
    
    
    
}
