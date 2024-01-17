
public final class Calculadora {
    // se puede instanciar
    // NO SE PUEDE HEREDAR
    String operacion;
    int numero1;
    int numero2;
    
    public void sumar()
    {
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }
}
