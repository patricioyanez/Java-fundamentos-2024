public interface Operaciones {
    
    // metodos en comun para todo el proyecto
    // siempre son publicos
    // todos los metodos son abstractos
    // wordpress
    
    int guardar();
    boolean existe();
    boolean eliminar();
    void limpiar();
    
    // declarar constantes (un valor que no cambia)
    
    final double PI = 3.1416;
    final int IVA = 19;
    final int TIPO_USUARIO_ADMINISTRADOR = 65465434;
    final int TIPO_USUARIO_VENDEDOR = 897945;
    // perfiles de usuario tipos usurioa
    
    
    
    
}
