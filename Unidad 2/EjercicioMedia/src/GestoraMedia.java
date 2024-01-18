
import java.util.ArrayList;


public class GestoraMedia {
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
    public boolean agregar(Usuario usuario)
    {
        for (Usuario aux : usuarios) {
            if(aux.getUsuario().equals(usuario.getUsuario()))
                return false;
        }
        
        return usuarios.add(usuario);
    }
    public void listar()
    {
        for (Usuario aux : usuarios) {
            System.out.println(aux.imprimir());
        }
    }
    public boolean buscarPorNombre(String nombreUsuario)
    {
        for (Usuario aux : usuarios) {
            if(aux.getUsuario().equalsIgnoreCase(nombreUsuario))
                return true;
        }
        return false;
    }
    public boolean eliminar(String nombreUsuario)
    {
        for (Usuario aux : usuarios) {
            if(aux.getUsuario().equalsIgnoreCase(nombreUsuario))
                return usuarios.remove(aux);
        }
        return false;
    }
}
