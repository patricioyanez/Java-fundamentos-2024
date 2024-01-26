
package modelo;

/**
CREATE TABLE Cargo
(
    idCargo             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);
 vendedor, gerente, supervisor, etc,
 
 */
public class Cargo {
    private int id;
    private String nombre;

    public Cargo() {
        this.id = 0;
        this.nombre = "";
    }
    public Cargo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void limpiar()
    {
        this.id = 0;
        this.nombre = "";        
    }
    
}
