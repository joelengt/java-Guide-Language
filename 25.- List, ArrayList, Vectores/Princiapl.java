
import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    // ArrayList

    ArrayList<String> androids = new ArrayList<String>();
    androids.add("CupCake");
    androids.add("Donut");
    androids.add("Eclair");
    androids.add("Froyo");
    androids.add("Gingerbread");
    androids.add("Honeycomb");

    System.out.println("Tamaño del ArrayList android: " + androids.size());
    System.out.println(androids);

    // Remover
    androids.remove(3);

    // Vectores
    Vector<String> androidsV2 = new Vector<String>();
    androidsV2.addElement("Ice Cream Sandwitch");
    androidsV2.addElement("Jelly Bean");
    androidsV2.addElement("Kit Kat");
    androidsV2.addElement("LolliPop");
    androidsV2.addElement("Marshmallow");

    System.out.println("Tamaño del Vector android: " + androidsV2.size());
    System.out.println(androidsV2);

    // Remover
    androidsV2.remove(2);
  }
}
