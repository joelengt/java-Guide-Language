
public class Principal {

  public static void main(String[] args) {

    Telefono telefonito = new Telefono(20, "Motorola", 12.3);
    telefonito.mostrarDatos();

    Telefono miTelefono = new Telefono(1, "Iphone", 21300);

    miTelefono.mostrarDatos();

    // Llamando a un metodo static
    Telefono.suma(20, 10);
    Telefono.multiplicar(2,20);
  }

}
