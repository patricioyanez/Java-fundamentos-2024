
public class Principal {
    
    // crear un par de objetos (8), crear clase gestora 
    // y agregar los objetos creados
    public static void main(String[] args) {
        Musica musica1 = new Musica(true, "patriciosp", "1234", 0, "spotify");
        Musica musica2 = new Musica(false, "patricioyt", "1234", 0, "youtube");
        
        GestoraMedia gm = new GestoraMedia();
        gm.agregar(musica1);
        gm.agregar(musica2);
        
        gm.listar();
    }
}
