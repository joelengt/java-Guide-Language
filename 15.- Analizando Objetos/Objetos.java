public class Objetos{
  public static void main(String[] args) {
    // Una clase es como una plantilla

    public class Telefono {
      // atributos
      int id;
      String marca;
      String modelo;
      double precio;

      // metodo
      public void mostrarDatos() {
        System.out.println("Datos");
        System.out.println("id: " + id);
        System.out.println("marca: " + marca);

      }
    }

    // Declarando un Objeto => Asignar un objeto a una variable
    //Telefono telefonito;

    // Instanciando Objeto => Poner al objeto en memoria para usarse
    //telefonito = new Telefono();

    // Declarando e Instanciando
    Telefono telefonito = new Telefono();

    telefonito.marca = "Motorola";
    telefonito.mostrarDatos();

  }
}
