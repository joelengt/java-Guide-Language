public class Operadores {
  public static void main(String[] args) {

    int a = 10;
    int b = 2;
    int respuesta;

    a = a + 1;
    b+=1;

    //respuesta = a * b;
    //respuesta = a / b;
    //respuesta = a % b;
    respuesta = a + b;
    //respuesta = a % b;

    System.out.println(respuesta);

    int numero = 5;
    // Incremento
    numero++;  // numero = numero + 1;  => Aqui primero lo incrementa y luego asigna el valor a la variable
    // Desglosado
    // Incrementando = numero + 1
    // Asignando el valor = numero = numero
    System.out.println(numero);

    ++numero;  // numero = numero + 1;  => Aqui primero tenemos la variable y luego lo incrementa
    // Desglosado
    // Asignando el valor => numero = numero
    // Incrementando el valor => numero + 1

    System.out.println(numero);  // 7
    System.out.println(numero++);  // 7
    System.out.println(++numero);  // 9


    // Decremento
    // numero--;
    // System.out.println(numero);


  }
}
