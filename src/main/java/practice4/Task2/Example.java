package practice4.Task2;

public class Example {
    static void main() {
        Ticket[] tickets = new Ticket[] {
                new AirTicket(1, "Leo", 40, "28-10-26", true,  "Москва", 100),
                new TheaterTicket(2, "Leo", 300, "29-10-26", 50,  "Москва слезам не верит"),
        };

        for (Ticket ticket : tickets) {
            System.out.println(ticket.calculateFinalPrice());
        }
    }
}
