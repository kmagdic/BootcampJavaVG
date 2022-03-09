package kristina.kristinacoffee;

public class CoffeeType {

    String name;
    String coffeeType;
    int waterNeeded;
    int milkNeeded;
    int beansNeeded;
    int cupsNeeded;
    int price;

    public CoffeeType(String name, int waterNeeded, int milkNeeded, int beansNeeded, int cupsNeeded, int price) {
        this.name = name;
        this.waterNeeded = waterNeeded;
        this.milkNeeded = milkNeeded;
        this.beansNeeded = beansNeeded;
        this.cupsNeeded = cupsNeeded;
        this.price = price;
        
    }

    @Override
    public String toString() {
        return "CoffeeType{" +
                "coffeeType='" + coffeeType + '\'' +
                ", waterNeeded=" + waterNeeded +
                ", milkNeeded=" + milkNeeded +
                ", beansNeeded=" + beansNeeded +
                ", cupsNeeded=" + cupsNeeded +
                ", price=" + price +
                '}';
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getWaterNeeded() {
        return waterNeeded;
    }

    public void setWaterNeeded(int waterNeeded) {
        this.waterNeeded = waterNeeded;
    }

    public int getMilkNeeded() {
        return milkNeeded;
    }

    public void setMilkNeeded(int milkNeeded) {
        this.milkNeeded = milkNeeded;
    }

    public int getBeansNeeded() {
        return beansNeeded;
    }

    public void setBeansNeeded(int beansNeeded) {
        this.beansNeeded = beansNeeded;
    }

    public int getCupsNeeded() {
        return cupsNeeded;
    }

    public void setCupsNeeded(int cupsNeeded) {
        this.cupsNeeded = cupsNeeded;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}