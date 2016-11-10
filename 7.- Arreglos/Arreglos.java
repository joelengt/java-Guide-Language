public class Arreglos {
  public static void main(String[] args) {

    // Arreglo Vector
    int[] miArreglo = new int[5];
    miArreglo[2] = 20;

    float[] miArregloFloat = new float[5];
    miArregloFloat[1] = 5.32F;

    String[] miArregloString = new String[2];

    miArregloString[0] = "Joel";
    miArregloString[1] = "Joel";
    miArregloString[2] = "Joel";

    System.out.println(miArregloFloat[1]);

    // Matriz 2D
    double[][] miArreglo2D = new double[5][2];
    // i, j
    miArreglo2D[0][0] = 1.23;
    miArreglo2D[0][1] = 1.43;
    miArreglo2D[1][0] = 2.23;

    // Matriz 3D
    char[][][] miArreglo3D = new char[3][3][5];
    miArreglo3D[0][0][0] = 'A';
    miArreglo3D[0][0][1] = 'B';
    miArreglo3D[0][0][2] = 'C';
    miArreglo3D[1][2][2] = 'D';

    System.out.println(miArreglo3D[0][0][1]);

    int[] miPrimerArreglo = new int[10];



  }
}
