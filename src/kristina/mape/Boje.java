package kristina.mape;

public class Boje {
    private String ime;
    private int red;
    private int green;
    private int blue;

    public Boje(String ime, int red, int green, int blue) {
        this.ime = ime;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
