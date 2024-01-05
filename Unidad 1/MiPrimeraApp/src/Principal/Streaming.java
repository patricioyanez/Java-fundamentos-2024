
package Principal;

public class Streaming {
    // atributos, constructores, g and s y pesonalizados
    Cancion cancionEnReproduccion;
    int segundosReproducidos;
    
    public void avanzar(int segundos)
    {
        int duracionCancion = cancionEnReproduccion.getDuracion();
        duracionCancion -= segundosReproducidos;
        
        if(segundos <= duracionCancion)
            segundosReproducidos += segundos;
        else
            System.out.println("No se puede adelantar");
    }
}
