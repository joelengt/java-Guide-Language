public class Objetos{

  public class Telefono {
    // atributos
    int id;
    String marca;
    String modelo;
    double precio;

    // Metodo
    public void mostrarDatos() {
      System.out.println("Mostrando los datos del Telefono");
      System.out.println("Id: " + id);
      System.out.println("marca: " + marca);
      System.out.println("modelo: " + modelo);
      System.out.println("precio: " + precio);
    }

  };

  public static void main(String[] args) {
    // Una clase es como una plantilla

    // Declarando nuestro objeto
    //Telefono miTelefono;

    // Instanciando nuestro objeto
    //miTelefono = new Telefono();  // La palabra reservada new -> Hace que ponga algo en la memoria.
    // Intenaciar = Crear un objeto, poner un objeto es la memoria

    // Declara e instancia En una linea
    Telefono miTelefono = new Telefono();

    // Metodo constructor por defecto toma el mismo nombre de la clase
    // Metodo constructor

    // Acceder a sus atributos
    miTelefono.marca = "Motorola";
    
    // Llamando al mentodo de mi objeto
    miTelefono.mostrarDatos();


  }
}
