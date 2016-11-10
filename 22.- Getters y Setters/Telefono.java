public class Telefono {

  // atributos
  private int id;  // El private hace que los objetos de esta clase no puedan consultar el atributo, asi que solo se podria hacer por getters y modificarlos por setters
  private String marca;
  String modelo;
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

  // Getters y Setters
  // get id
  public int getId() {
    return id;
  }
  // set id
  public void setId(int id){
    this.id = id;
  }

  // get marca
  public String getMarca() {
    return marca;
  }
  // set marca
  public void setMarca(String marca) {
    this.marca = marca;
  }

  // get modelo
  public String getModelo() {
    return modelo;
  }
  // set modelo
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  // get precio
  public double getPrecio() {
    return precio;
  }

  //set precio
  public void setPrecio(double precio){
    if(precio > 0) {
      this.precio = precio;

    } else {
      System.out.println("El valor ingresado no es valido");
    }
  }

  public static int suma(int a, int b) {
    return a + b;
  }

  public static void multiplicar(int a, int b) {
    System.out.println(a * b);
  }


}
