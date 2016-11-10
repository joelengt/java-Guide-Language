public class Playera extends Ropa implements IDevolucion {

  public Playera(int id, double precio, String talla, String color) {
    super(id, precio, talla, color);

  }

  public void cortaVasta() {
    // ...
  }

  @Override
  public void hacerDevolucion() {
    System.out.println("Devolucion de una playera");
  }

}
