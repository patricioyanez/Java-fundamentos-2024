
public abstract class Usuario {
    private String usuario;
    private String clave;
    private int tiempoConectado;
    private String nombreRecurso; // nombre de canción, pelicula, serie, etc.

    public Usuario() {
        this.usuario = "";
        this.clave = "";
        this.tiempoConectado = 0;
        this.nombreRecurso = "";
    }

    public Usuario(String usuario, String clave, int tiempoConectado, String nombreRecurso) {
        this.usuario = usuario;
        this.clave = clave;
        this.tiempoConectado = tiempoConectado;
        this.nombreRecurso = nombreRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }


    public String imprimir() {
        return  "\nUsuario           = " + usuario + 
                "\nClave             = " + clave + 
                "\nTiempo Conectado  = " + tiempoConectado + 
                "\nNombre Recurso    = " + nombreRecurso;
    }
    
    
}
