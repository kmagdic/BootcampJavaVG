package Bicikleto;

import java.util.Scanner;

public class Terminal {
    private String name;
    private String lokacija;
    private boolean isOn;

    public Terminal(){

    }

    public Terminal(String name, String lokacija, boolean isOn) {
        this.name = name;
        this.lokacija = lokacija;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "name='" + name + '\'' +
                ", lokacija='" + lokacija + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getName() {
        return name;
    }

    public String getLokacija() {
        return lokacija;
    }

    public boolean isOn() {
        return isOn;
    }
}
