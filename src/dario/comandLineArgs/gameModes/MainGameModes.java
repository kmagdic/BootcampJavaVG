package dario.comandLineArgs.gameModes;

public class MainGameModes {
    public static void main(String[] args) {
        boolean writeDefault = true;
        for (int i = 0; i < args.length; i = i + 2) {
            if ("mode".equals(args[i])) {
                System.out.println(args[i + 1]);
                writeDefault = false;
                break;
            }
        }
        if (writeDefault) {
            System.out.println("default");
        }
    }
}
