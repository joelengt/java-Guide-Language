public class Polo extends Ropa {
  public Polo(int id, double precio, String talla, String color, Boolean dibujo, char genero) {
    super(id, precio, talla, color);
    this.dibujo = dibujo;
    this.genero = genero;
  }

  private Boolean dibujo;
  private char genero;

  public Boolean getDibujo() {
    return dibujo;
  }
  public void setDibujo(Boolean dibujo) {
    this.dibujo = dibujo;
  }

  public char getGenero(){
    return genero;
  }
  public void setGenero(char genero) {
    this.genero = genero;
  }

  // Polimorfismo
  // sobreescribiendo el metodo del padre para esta clase que la heredo
  // tengo una nueva forma de usarlo en comportamiento
  @Override
  public void mostrarDatos(String nombreClase) {
    super.mostrarDatos(nombreClase);
    System.out.println("dibujo : " + dibujo);
    System.out.println("genero : " + genero);
  }
}
