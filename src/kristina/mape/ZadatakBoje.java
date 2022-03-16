package kristina.mape;

import java.util.HashMap;
import java.util.Map;

public class ZadatakBoje {

    public static void main(String[] args) {

        Boje crvena = new Boje("crvena", 204, 0, 0);
        Boje smeđa = new Boje("smeđa", 153, 102, 0);
        Boje ljubičasta = new Boje("ljubičasta", 160, 0, 160);

        Map<String, Boje> mojeBoje = new HashMap<>();

        mojeBoje.put(crvena.getIme(), crvena);
        mojeBoje.put(smeđa.getIme(), smeđa);
        mojeBoje.put(ljubičasta.getIme(), ljubičasta);

        for (String key : mojeBoje.keySet()) {
            System.out.println(key);
            System.out.println("Red: " + mojeBoje.get(key).getRed() + " Green: " + mojeBoje.get(key).getGreen() + " Blue: " + mojeBoje.get(key).getBlue());
        }

    }
}
