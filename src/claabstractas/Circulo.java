
package claabstractas;

/**
 *
 * @author dilan
 */
public class Circulo implements Forma,Dibujable,Rotable{
    
    private double radio;
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calularArea() {
      double resultado=radio*3.1416;
     return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el circulo");
    }
    
}
