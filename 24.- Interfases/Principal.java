// Interfases

// Si tengo una clase Padre Ropa
    // Hijos Player, Jean, Zapato

// Si tengo una clase Telefono
  // SmartPhone, Ladrillo

// ¿Que tienen en comun sus hijo?
// Pueden tener el devolder producto.

public class Principal {
  public static void main(String[] args) {
    Playera playerita = new Playera(1, 2.33,"Small","Red");
    PlayeraPersonalizada playerita2 = new PlayeraPersonalizada(3, 2.332333,"Small","Purple","joelengt");
    Jean jeanItaliam = new Jean(2,3213.32,"Medium","Blue",4);
    Polo polito = new Polo(5, 2.4555, "Small","Pink", true, 'F');

    Celular iphone = new Celular(15, 233.23, "apple", "5s", "Movistar");
    TelefonoFijo claro = new TelefonoFijo(923, 42.23, "Telcom", "434ddsd", true);

    playerita.mostrarDatos("playerita");
    jeanItaliam.mostrarDatos("Jean Italium");
    polito.mostrarDatos("Polo para Chica");
    playerita2.mostrarDatos("Mi playera con mi Twitter");

    playerita.hacerDevolucion();
    jeanItaliam.hacerDevolucion();
    polito.hacerDevolucion();

    iphone.hacerDevolucion();
    claro.hacerDevolucion();


  }
}
