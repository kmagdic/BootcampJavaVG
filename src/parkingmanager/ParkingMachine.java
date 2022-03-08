package parkingmanager;

public class ParkingMachine {
    private String location;
    private int ticketPrice;
    private int currMoney;


    ParkingMachine() {

    }
    ParkingMachine (String location, int price, int currMoney) {
        this.location = location;
        this.ticketPrice = price;
        this.currMoney = currMoney;
    }

    @Override
    public String toString() {
        return "ParkingMachine{" +
                "location='" + location + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", currMoney=" + currMoney +
                '}';
    }

    public Ticket createTicket() {
        Ticket t = new Ticket();
        t.setParkingMachine(this);
        t.setPrice(this.ticketPrice);

        currMoney = currMoney + t.getPrice();
        return t;

    }


    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }
}

