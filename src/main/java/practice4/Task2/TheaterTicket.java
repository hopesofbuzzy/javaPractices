package practice4.Task2;

import java.util.Objects;

public class TheaterTicket extends Ticket {
    double discount = 0;
    String showTitle;

    public TheaterTicket(int num, String personName, double price, String date, double discount, String showTitle) {
        super(num, personName, price, date);
        this.discount = discount;
        this.showTitle = showTitle;
    }

    // price = price * (1 - discount / 100)
    public double calculateFinalPrice() {
        double basePrice = super.calculateFinalPrice();
        return basePrice * (1 - discount / 100);
    }

    @Override
    public String getDescription() {
        return toString() + "\nДетали: Билет на спектакль! Есть скидка!";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", Скидка: " + discount +
            ", Постановка: " + showTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TheaterTicket that = (TheaterTicket) o;
        return Double.compare(discount, that.discount) == 0 && Objects.equals(showTitle, that.showTitle);
    }
}
