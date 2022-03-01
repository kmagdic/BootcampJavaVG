package parkingmanager;

public class ParkingMachine {
    private String location;
    private int price;
    ParkingMachine() {
    }
    ParkingMachine (String location, int price) {
    this.location = location;
    this.price = price;
    }

    @Override
    public String toString() {
        return "ParkingMachine{" +
                "location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

