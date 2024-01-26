package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Cargo;


public class ControladorCargo {
    public boolean agregar(Cargo cargo) 
    {
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "INSERT INTO CARGO (NOMBRE) VALUES (?)";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, cargo.getNombre());
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
    public boolean modificar(Cargo cargo) 
    {
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "UPDATE CARGO SET NOMBRE = ? WHERE IDCARGO = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, cargo.getNombre());
            st.setInt(2, cargo.getId());
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
            String sql = "DELETE FROM CARGO WHERE IDCARGO = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);            

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
    public Cargo buscarPorId(int id)
    {
       try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "SELECT idCargo, nombre FROM CARGO WHERE IDCARGO = ?";

            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("idCargo"));
                cargo.setNombre(rs.getString("nombre"));
                return cargo;
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
    public ArrayList<Cargo> buscarTodo()
    {
        ArrayList<Cargo> listado = new ArrayList<Cargo>();
        try
        {
            Conexion conexion = new Conexion();
            Connection cx = conexion.obtenerConexion();
            String sql = "SELECT idCargo, nombre FROM cargo";

            PreparedStatement st;
            st = cx.prepareStatement(sql);           
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Cargo cargo = new Cargo();
                cargo.setId(rs.getInt("idCargo"));
                cargo.setNombre(rs.getString("nombre"));
                listado.add(cargo);
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
