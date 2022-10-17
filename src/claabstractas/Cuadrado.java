
package claabstractas;

/**
 *
 * @author dilan
 */
public class Cuadrado implements Forma,Dibujable {

    private double lado;
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calularArea() {
         double resultado=lado*lado;
       return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }


    
}
