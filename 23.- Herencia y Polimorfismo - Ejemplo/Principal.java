public class Principal {
  public static void main(String[] args) {
    Playera playerita = new Playera(1, 2.33,"Small","Red");
    Jean jeanItaliam = new Jean(2,3213.32,"Medium","Blue",4);
    Polo polito = new Polo(5, 2.4555, "Small","Pink", true, 'F');

    playerita.mostrarDatos("playerita");
    jeanItaliam.mostrarDatos("Jean Italium");
    polito.mostrarDatos("Polo para Chica");
  }
}
