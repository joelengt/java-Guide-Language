public class Constructores {

  public class Telefono {
    int id;
    String marca;
    String modelo;
    double precio;

    // constructor
    public Telefono () {

    }

    public Telefono (int id, String modelo, double precio) {
      this.id = id;
      this.modelo = modelo;
      this.precio = precio;
    }

    public void mostrarDatos() {
      System.out.println("Datos del telefono";
      System.out.println("id: " + id);
      System.out.println("marca: " + marca);
      System.out.println("precio: " + precio);

    }

  }

  public static void main(String[] args) {
    // Sobre carga de metodos (overload)
    // Aveces cuando requerimos que dos o mas metodos tengan el mismo nombre pero con diferentes argumentos

    Telefono telefonito = new Telefono(12, "Hola", 12.3243);
    telefonito.modelo;
    telefonito.mostrarDatos();

  }

  public float suma(float a, float b){
   return a + b;
  }

  public float suma(int a, float b) {
    return a + b;
  }

  public int suma(int a, int b) {
    return a + b;
  }

  // El metodo suma esta sobre cargardo
  // tiene el mismo nombre
  // pero diferentes parametros
  // y retornos diferentes
}
