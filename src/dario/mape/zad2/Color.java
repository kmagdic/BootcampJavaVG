package dario.mape.zad2;

public class Color {

    String name;
    int r;
    int b;
    int g;

    public Color(String name) {
        this.name = name;
    }

    public Color(String name, int r, int b, int g) {
        this.name = name;
        this.r = r;
        this.b = b;
        this.g = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
}
