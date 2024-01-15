
public class Principal {
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
        
        ag.setRut("41234123");
        ag.setNombre("Juan");
        ag.setApellido("Perez");
        ag.setCarrera("Astronomia");
        ag.setAnioIngreso(2000);
        ag.setFueBeneficiado(true);
        
        System.out.println("*** Datos del alumno ***");
        System.out.println(ag.imprimir());
        
    }
}
