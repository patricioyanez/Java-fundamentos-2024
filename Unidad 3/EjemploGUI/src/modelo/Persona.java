
package modelo;

public class Persona {
    private int rut;
    private String dv;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String direccion;
    private String comuna;
    private boolean esChileno;

    public Persona() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
        this.apellido = "";
        this.estadoCivil = "";
        this.direccion = "";
        this.comuna = "";
        this.esChileno = true;
    }
    public Persona(int rut, String dv, String nombre, String apellido, String estadoCivil, String direccion, String comuna, boolean esChileno) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.direccion = direccion;
        this.comuna = comuna;
        this.esChileno = esChileno;
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
    
    
    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public boolean isEsChileno() {
        return esChileno;
    }

    public void setEsChileno(boolean esChileno) {
        this.esChileno = esChileno;
    }

    public String imprimir() {
        return "Persona{" + "rut=" + rut + ", dv=" + dv + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", direccion=" + direccion + ", comuna=" + comuna + ", esChileno=" + esChileno + '}';
    }
    
    public boolean validarRut() {
        int suma = 0;
        int multiplicador = 2;
        String rutAux = "" + this.rut;
        // Recorrer el cuerpo del RUT de derecha a izquierda
        for (int i = rutAux.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(rutAux.charAt(i));
            suma += digito * multiplicador;

            multiplicador = multiplicador == 7 ? 2 : multiplicador + 1;
        }

        // Calcular el dígito verificador
        int resto = suma % 11;
        int resultado = 11 - resto;
        
        if(resultado == 11 && this.dv.equals("0") )
            return true;
        else if(resultado == 10 && this.dv.toUpperCase().equals("K"))
            return true;
        else if (resultado > 0 && resultado < 10)
        {
            int digito = Integer.parseInt(this.dv);
            if(resultado ==  digito)
                return true;            
        }
        return false;
    }
    
}
