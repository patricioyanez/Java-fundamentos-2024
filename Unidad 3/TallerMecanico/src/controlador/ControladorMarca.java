package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public boolean eliminar(int id)
    {
       try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "DELETE FROM MARCA WHERE ID = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(0, id);            

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
       try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM marca WHERE ID = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(0, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1 ? true: false);
            }
            
            st.close();
            cx.close();
            return null;
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR:" + ex.getMessage());
        }
        return null; 
    }
    public ArrayList<Marca> buscarTodo()
    {
        ArrayList<Marca> listado = new ArrayList<Marca>();
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM marca";

            PreparedStatement st;
            st = cx.prepareStatement(sql);           
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1 ? true: false);
                listado.add(marca);
            }            
            st.close();
            cx.close();
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR:" + ex.getMessage());
        }
        return listado;
    }
}
