package Bicikleto;

public class Bicikl {
    private String model;
    private int year;
    private Terminal terminal;

    @Override
    public String toString() {
        return "Bicikl{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", terminal=" + terminal +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public Bicikl() {
    }
    public Bicikl(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
