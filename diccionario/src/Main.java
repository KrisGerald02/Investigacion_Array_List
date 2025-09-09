import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        // aqui creo el diccionario
        Dictionary<String, String> diccionario = new Hashtable<>();

        // add elem
        diccionario.put("001", "Manzana");
        diccionario.put("002", "Banana");
        diccionario.put("003", "Cereza");

        // mos elem
        Enumeration<String> claves = diccionario.keys();
        while(claves.hasMoreElements()) {
            String clave = claves.nextElement();
            System.out.println(clave + " -> " + diccionario.get(clave));
        }

        // elimino el 002
        diccionario.remove("002");
        System.out.println("Después de eliminar el elemento quedan: " + diccionario.size() + " elementos");
    }
}
