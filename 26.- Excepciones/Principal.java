public class Principal {
  public static void main(String[] args) {

    // Los Vectores usan hilos para construirse
    // Los ArrayList no   (*) de preferencia

    // Para poder ver las Excepciones tenemos
    try{
      // Codigo que podria provocar errores

    } catch (ExceptionType nombre){
      // Gestion de un tipo de error
      // Ejemplo = una excepcion de SQL, un resultado aritmetico

    } catch (ExceptionType nombre){
      // Gestion de otro tipo de error

    } finally {
      // Siempre se ejecuta este bloque
      // Ocurre lo que finalmente ocurrira pase o no
    }


    // Ejemplo : cuando acceso a un indice no definido
    int[] numeros = {1,23,4};

    try {
      System.out.println(numeros[0]);
      System.out.println(numeros[1]);
      System.out.println(numeros[2]);
      System.out.println(numeros[3]);
      System.out.println(":(");

    } catch(ArrayIndexOutOfBoundsException arrayE) {
      System.out.println("Estas intentando ingresar a una localidad no definida");

    } catch(Exception e){
      System.out.println("Ocurrio un error");
       e.printStackTrace();
       // Estos errores no es bueno mostrarselos al usuario
       
    } finally {
      System.out.println(":)");
    }

  }
}
