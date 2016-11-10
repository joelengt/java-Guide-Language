public class Ciclos {
  public static void main(String[] args) {
    System.out.println("Inicio");

    // Ciclo For
    System.out.println("Ciclo For");

    for (int i = 0; i <= 20; i++) {
      System.out.println("Iteracion: " + i);
    }

    // Llenando arreglo
    String[] frutas = new String[3];


    for (int j = 0; j <= 20; j++) {
      frutas[j] = "Manzana";
      System.out.println(frutas[j]);
    }

    // Ciclo while
    System.out.println("Ciclo While");

    int a = 0;
    while (a <= 20) {
      System.out.println("Iteracion: " + a);
      a++;
    }

    // For Each
    int[] coleccion = new int[5];
    coleccion[0] = 10;
    coleccion[1] = 120;
    coleccion[2] = 230;
    coleccion[3] = 30;
    coleccion[4] = 50;

    for (int elemento : coleccion) {
      System.out.println("Elemento Colecccion: " + elemento);
    }

  }
}
