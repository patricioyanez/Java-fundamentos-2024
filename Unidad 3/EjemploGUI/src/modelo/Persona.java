
package modelo;

public class Persona {
    private int rut;
    private String dv;
    private String nombre;
    private String apellido;

    public Persona() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
        this.apellido = "";
    }
    public Persona(int rut, String dv, String nombre, String apellido) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
