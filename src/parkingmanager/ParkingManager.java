package parkingmanager;

public class ParkingManager {
    public static void main(String[] args) {
        ParkingMachine pkm1 = new ParkingMachine("Vukovarska 123", 10, 200);

        Ticket t1 = pkm1.createTicket();
        Ticket t2 = pkm1.createTicket();

        System.out.println(t1);
        System.out.println(t2);


        System.out.println(pkm1);


        System.out.println(" --- ");

        ParkingMachine pkm2 = new ParkingMachine();
        pkm2.setLocation("Maksimirska 141");
        pkm2.setTicketPrice(200);

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
