public class Jean extends Ropa implements IDevolucion {

  // Sobreescrito el constructor del padre para este hijo
  public Jean(int id, double precio, String talla, String color, int numeroBolsillos) {
    super(id, precio, talla, color);  // Refiera la super clase o clase padre -> ropa
    // Estoy implementando codigo, en un metodo que estoy sobreescribiendo
    this.numeroBolsillos = numeroBolsillos;
  }

  private int numeroBolsillos;

  public int getNumeroBolsillos() {
    return numeroBolsillos;
  }
  public void setNumeroBolsillos(int numeroBolsillos) {
    this.numeroBolsillos = numeroBolsillos;
  }

  public void infoId() {
    System.out.println(getId());
  }
  // En la herencia se pueden accedera a metodos public, y protected
  // pero no a los private o default - a menos que lo retorne en un metodo como get o set

  // Para motrar todos sus datos  de este hijo al ejecutar el metodo del padre
  // faltaria los nuevo que este tiene
  // asi que hay que sobreescribirlo

  // Polimorfismo
  @Override
  public void mostrarDatos(String nombreClase) {
    super.mostrarDatos(nombreClase); //Ejecuta el metodo de la clase padre con los datos que tiene esta clase
    System.out.println("Numero de bolsillos: " + numeroBolsillos);
    // Estoy sobreescribiendo el metodo y agregandole un nuevo comportamiento
  }

  @Override
  public void hacerDevolucion() {
    System.out.println("Devolucion de un Jean");
  }

}
