package parkingmanager;

public class Ticket {
    private String ticketType;
    private String timeOfPrinting;
    private ParkingMachine parkingMachine;

    Ticket() {
    }
    Ticket(String ticketType, String timeOfPrinting){
        this.ticketType = ticketType;
        this.timeOfPrinting = timeOfPrinting;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketType='" + ticketType + '\'' +
                ", timeOfPrinting='" + timeOfPrinting + '\'' +
                ", parkingMachine=" + parkingMachine +
                '}';
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTimeOfPrinting() {
        return timeOfPrinting;
    }

    public void setTimeOfPrinting(String timeOfPrinting) {
        this.timeOfPrinting = timeOfPrinting;
    }

    public ParkingMachine getParkingMachine() {
        return parkingMachine;
    }

    public void setParkingMachine(ParkingMachine parkingMachine) {
        this.parkingMachine = parkingMachine;
    }
}