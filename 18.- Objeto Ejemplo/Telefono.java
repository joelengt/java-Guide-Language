public class Telefono {

  // atributos
  // Para evitar que se puedan corregir estos datos los pongo en privado
  private int id;
  private String marca;
  private String modelo;
  private double precio;

  // sobrecardo el metodo para controlarlo

  // constructor por defecto
  public Telefono() {
    this.id = 1;
    this.modelo = "modelo";
    this.precio = 21.23;
  }

  // constructor con parametros
  public Telefono(int id, String modelo, double precio) {
    this.id = id;
    this.modelo = modelo;
    this.precio = precio;
  }

  public void mostrarDatos() {
    System.out.println("Datos del telefono");
    System.out.println("id: " + id);
    System.out.println("modelo: " + modelo);
    System.out.println("precio: " + precio);

  }

  public static int suma(int a, int b) {
    return a + b;
  }

  public static void multiplicar(int a, int b) {
    System.out.println(a * b);
  }


}
