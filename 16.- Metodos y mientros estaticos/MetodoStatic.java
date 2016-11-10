public class MetodoStatic{
  public static void main(String[] args) {
    // Una clase es como una plantilla

    // Math.PI;
    // Math.random(); Un ejemplo de un static

    // Mientro static -> usarlos en todo el programa NombreDeLaClase.metodo();
    public class Calculadora {
      // Metodo static
      public static int suma(int a, int b) {
        return a + b;
      }

      // Atributo static
      public static final double PI = 3.1416;
      public static int valor = 0;
      // Estos atributos son accesibles en todo el programa incluso pueden modificarse
    }

    // Puedo acceder a su metodo sin declara un objeto
    Calculadora.suma(20, 30);
    Calculadora.PI;

  }
}
