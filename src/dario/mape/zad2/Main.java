package dario.mape.zad2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Color red = new Color("Red", 204, 0, 0);
        Color brown = new Color("Brown", 153, 102, 0);
        Color purple = new Color("Purple", 160, 0, 160);

        Map<String, Color> mapaBoja = new HashMap<>();
        mapaBoja.put(red.name, red);
        mapaBoja.put(brown.name, brown);
        mapaBoja.put(purple.name, purple);

        for (Color boja: mapaBoja.values()) {
            System.out.println(boja.name);
            System.out.println("Red:" + boja.r + " Green:" + boja.g + " Blue:" + boja.b);
        }
    }
}
