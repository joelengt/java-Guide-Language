// Los Metodos Getters y Setters no sayudaran a leer y escribir el valor de una variable miembro

// Normalmente los datos mientro de la clase estan oculta y privadas por defecto
// Pero si quiero actualizar esos datos en un futuro?

// Obtener un dato e incluso poder actualizarlo

// Getter => Obtener datos variables
// Setter => Asignar o cambiar variable

// Por cada atributo que tenga nuestra clase seria bueno asignar un metodo ser y get
public class Principal {
  public static void main(String[] args) {
    Telefono miTelefono = new Telefono(2,"Motorola",23.32);
    miTelefono.mostrarDatos();

    Telefono tuTelefono = new Telefono(1, "Nexus", 30.23);
    //tuTelefono.marca = "Chino";
    tuTelefono.mostrarDatos();
    tuTelefono.getMarca();  //getter de id

    System.out.println(tuTelefono.getModelo());

    tuTelefono.setModelo("Alcatel");
    System.out.println(tuTelefono.getModelo());


  }
}
