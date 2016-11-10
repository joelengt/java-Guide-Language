public class Principal {
  public static void main(String[] args) {
    Telefono miTelefono = new Telefono(2,"Motorola",23.32);
    miTelefono.mostrarDatos();

    Telefono tuTelefono = new Telefono(1, "Nexus", 30.23);
    //tuTelefono.marca = "Chino";
    tuTelefono.mostrarDatos();
  }
}
