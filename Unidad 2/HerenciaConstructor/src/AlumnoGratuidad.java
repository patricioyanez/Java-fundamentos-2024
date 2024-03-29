
public class AlumnoGratuidad extends Alumno{
    private boolean fueBeneficiado;

    public AlumnoGratuidad() {
        this.fueBeneficiado = false;
        System.out.println("Constructor AlumnoGratuidad");
    }
    
    public AlumnoGratuidad(boolean fueBeneficiado, String carrera, int anioIngreso, String rut, String nombre, String apellido) {
        super(carrera, anioIngreso, rut, nombre, apellido);
        this.fueBeneficiado = fueBeneficiado;
        System.out.println("Constructor AlumnoGratuidad");
    }

    public boolean isFueBeneficiado() {
        return fueBeneficiado;
    }

    public void setFueBeneficiado(boolean fueBeneficiado) {
        this.fueBeneficiado = fueBeneficiado;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
                "\nFue beneficiado   = " + (this.fueBeneficiado?"si":"no");
    }
    
    
}
