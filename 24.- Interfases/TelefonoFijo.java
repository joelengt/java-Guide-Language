public class TelefonoFijo extends Telefono implements IDevolucion{
  public TelefonoFijo(int id, double precio, String marca, String modelo, boolean inalambrico) {
    super(id, precio, marca, modelo);
    this.inalambrico = inalambrico;
  }

  private boolean inalambrico;

  public boolean getInalambrico() {
    return inalambrico;
  }
  public void setInalambrico(boolean inalambrico) {
    this.inalambrico = inalambrico;
  }

  @Override
  public void hacerDevolucion() {
    System.out.println("Devolucion de un Telefono fijo");
  }

}
