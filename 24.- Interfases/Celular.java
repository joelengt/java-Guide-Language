public class Celular extends Telefono implements IDevolucion  {
  public Celular(int id, double precio, String marca, String modelo, String SIM) {
    super(id, precio, marca, modelo);
    this.SIM = SIM;
  }

  private String SIM;

  public String getSIM(){
    return SIM;
  }
  public void setSIM(String SIM){
    this.SIM = SIM;
  }

  @Override
  public void hacerDevolucion() {
    System.out.println("Devolucion de un Celular");
  }

}
