package Bicikleto;

public class BicManager {
    public static void main(String[] args) {
        Terminal kvatric = new Terminal("Kvatrić", "Kvatrić", true);
        Terminal velikaG = new Terminal("Velika Gorica", "Velika Gorica", false);

        Bicikl bic1 = new Bicikl();
        bic1.setTerminal(kvatric);
        Bicikl bic2 = new Bicikl();
        bic2.setTerminal(kvatric);
        Bicikl bic3 = new Bicikl("Cube", 2018);
        bic3.setTerminal(kvatric);

        Bicikl bic4 = new Bicikl();
        bic4.setTerminal(velikaG);
        Bicikl bic5 = new Bicikl("Diamonback", 2005);
        bic5.setTerminal(velikaG);

        System.out.println(bic3);
        System.out.println(bic5);

    }
}
