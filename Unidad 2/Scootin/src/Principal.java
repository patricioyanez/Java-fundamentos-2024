
public class Principal {
    public static void main(String[] args) {
        /*
        Ejercicio: agregar empleados, 1 es el gerente y otro es vendedor
        mostrar la lista de empleados actuales
        */
        Puesto gerente = new Puesto(1, "Gerente");
        Puesto vendedor = new Puesto(2, "Vendedor");
        
        Empleado empleado1 = new Empleado("1", "juan", "M", 2023, 35, gerente);
        Empleado empleado2 = new Empleado("2", "ana", "F", 2020, 25, vendedor);
        Empleado empleado3 = new Empleado("30", "Su", "F", 2020, 28, vendedor);
        Empleado empleado4 = new Empleado("30", "Lou", "M", 2021, 28, vendedor);
        
        Empresa scootin = new Empresa();
        scootin.agregar(empleado1);
        scootin.agregar(empleado2);
        scootin.agregar(empleado3);
        scootin.agregar(empleado4);
        
        scootin.listarEmpleados();
        
    }
}
