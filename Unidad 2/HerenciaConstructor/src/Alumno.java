
public class Alumno extends Persona{
    private String carrera;
    private int anioIngreso;

    public Alumno() {
        this.carrera = "";
        this.anioIngreso = 0;
        System.out.println("Constructor Alumno");
    }
    
    public Alumno(String carrera, int anioIngreso, String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
        System.out.println("Constructor Alumno");
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
               "\nCarrera           = " + this.carrera + 
               "\nAño Ingreso       = " + this.getAnioIngreso();
    }
    
    
}
