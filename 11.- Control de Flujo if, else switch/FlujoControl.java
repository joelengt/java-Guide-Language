public class FlujoControl {
  public static void main(String[] args) {
    int a = 20;
    int b = 10;

    // Sentencia condicional If
    if (a < b) {
      System.out.println("a es menor");

    } else if (a > b){
      System.out.println("a es mayor");

    } else {
      System.out.println("Son iguales");
    }

    // Swift
    char value = 'A';

    switch(value){
      case 'A':
        System.out.println("Es A");
        break;

      case 'B':
        System.out.println("Es B");
        break;

      default:
        System.out.println("No es ninguno");
        break;
    }

    int numero = 20;
    switch(numero){
      case  1000:
        System.out.println("El numero es multiplo de 2");
        break;
      case 20:
        System.out.println("El numero es multiplo de 2");
        break;
      default:
        System.out.println("No hay opciones");
        break;
    }

    char letra = 'a';

    switch(letra) {
      case 'a':
        System.out.println("a");
        break;
      case 'b':
        System.out.println("b");
        break;
      default:
        System.out.println("No se encuentra la letra");
        break;
    }

  }
}
