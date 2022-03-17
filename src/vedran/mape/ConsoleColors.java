package vedran.mape;

import java.util.HashMap;
import java.util.Map;

public class ConsoleColors {
    public static void main(String[] args) {
        Color color1 = new Color("yellow", 255, 255, 0);
        Color color2 = new Color("dark red", 64, 0, 0);
        Color color3 = new Color("cyan", 0, 255, 255);

        Map<String, Color> colors = new HashMap<>();
        colors.put(color1.getName(), color1);
        colors.put(color2.getName(), color2);
        colors.put(color3.getName(), color3);

        for (String key : colors.keySet()) {
            System.out.println(key);
            System.out.println("Red: " + colors.get(key).getR() +
                    " Green: " + colors.get(key).getG() +
                    " Blue: " + colors.get(key).getB());

        }
    }
}