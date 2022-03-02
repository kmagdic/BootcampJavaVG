package parkingmanager;

public class ParkingManager {
    public static void main(String[] args) {
        ParkingMachine pkm1 = new ParkingMachine();
        pkm1.setLocation("Vukovarska 42");
        pkm1.setPrice(100);

        ParkingMachine pkm2 = new ParkingMachine();
        pkm2.setLocation("Maksimirska 141");
        pkm2.setPrice(200);

        Ticket ticket1 = new Ticket();
        ticket1.setTicketType("daily");
        ticket1.setTimeOfPrinting("12:30");
        ticket1.setParkingMachine(pkm1);

        Ticket ticket2 = new Ticket();
        ticket2.setTicketType("nightly");
        ticket2.setTimeOfPrinting("22:45");
        ticket2.setParkingMachine(pkm2);

        System.out.println(ticket1);
        System.out.println(ticket2);
    }

}
