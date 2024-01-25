package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Marca;


public class ControladorMarca {
    public boolean agregar(Marca marca) 
    {
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "INSERT INTO MARCA (NOMBRE, HABILITADO) VALUES (?,?)";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(0, marca.getNombre());
            st.setInt(1, (marca.isHabilitado()?1:0));
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR:" + ex.getMessage());
        }
        return false;
    }
    public boolean modificar(Marca marca) 
    {
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "UPDATE SET MARCA NOMBRE = ?, HABILITADO = ? WHERE ID = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(0, marca.getNombre());
            st.setInt(1, (marca.isHabilitado()?1:0));
            st.setInt(2, marca.getId());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR:" + ex.getMessage());
        }
        return false;
    }
    public Marca buscarPorId(int id)
    {
        
    }
    
    public boolean eliminar(int id)
    {
        
    }
}
