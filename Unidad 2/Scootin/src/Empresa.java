
import java.util.ArrayList;

/*
    Clase gestora de la colección
*/
public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    public boolean agregar(Empleado empleado)
    {
        // validar que el rut no se repita
        return empleados.add(empleado);
    }
    
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return true;
        }
        return false;
    }
    public void listarEmpleados()
    {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
    public boolean eliminarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return empleados.remove(empleado);
        }
        return false;
    }
}
