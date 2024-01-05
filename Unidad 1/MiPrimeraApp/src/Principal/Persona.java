
package Principal;

public class Persona {
    private int rut;
    private String dv;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private int anioIngreso;
    private int sueldo;
    private boolean esChileno;
    
    public Persona() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
        this.apellido = "";
        this.correo = "";
        this.direccion = "";
        this.anioIngreso = 1900;
        this.sueldo = 0;
        this.esChileno = false;
    }
    public Persona(int rut, String dv, String nombre, String apellido, String correo, String direccion, int anioIngreso, int sueldo, boolean esChileno) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.anioIngreso = anioIngreso;
        this.sueldo = sueldo;
        this.esChileno = esChileno;
    }

    public boolean isEsChileno() {
        return esChileno;
    }

    public void setEsChileno(boolean esChileno) {
        this.esChileno = esChileno;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion=" + direccion + ", anioIngreso=" + anioIngreso + ", sueldo=" + sueldo + ", esChileno=" + esChileno + '}';
    }
    
    public String imprimirDatos()
    {
        return "Rut         : " + rut + "-" + dv + 
                "\nNombre       : " + nombre + 
                "\nApellido     : " + apellido + 
                "\nCorreo       : " + correo + 
                "\nDirección    : " + direccion + 
                "\nAño Ingreso  : " + anioIngreso + 
                "\nSueldo       : " + sueldo + 
                "\nEs Chileno   : " + esChileno;
    }
    
}
