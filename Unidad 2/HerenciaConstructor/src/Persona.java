
public class Persona {
    private String rut;
    private String nombre;
    private String apellido;

    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.apellido = "";
        System.out.println("Constructor Persona");
    }
    
    public Persona(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Constructor Persona");
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String imprimir() {
        return "Rut         = " + rut + 
               "\nNombre      =" + nombre + 
                "\nApellido   =" + apellido;
    }
    
    
}
