
package Principal;

public class Cancion {
    // atributos
    private String nombre;
    private String album;
    private String artista;
    private String genero;
    private int duracion;
            
    // constructor
    public Cancion() {    
        this.nombre = "";
        this.album = "";
        this.artista = "";
        this.genero = "";
        this.duracion = 0;
    }

    public Cancion(String nombre, String album, String artista, String genero, int duracion) {    
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    // metodos personalizados

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", album=" + album + ", artista=" + artista + ", genero=" + genero + ", duracion=" + duracion + '}';
    }
    
}
