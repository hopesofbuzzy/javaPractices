package practice4.Task2;

import java.util.Objects;

public class Ticket {
    int num;
    String personName;
    double price;
    String date;

    public Ticket(int num, String personName, double price, String date) {
        this.num = num;
        this.personName = personName;
        this.price = price;
        this.date = date;
    }

    // price = price
    public double calculateFinalPrice() {
        return price;
    }

    public String getDescription() {
        return toString() + "\nДетали: обычный билет для поездок или событий.";
    }

    @Override
    public String toString() {
        return "Билет: " +
            "Номер: " + num +
                ", Имя: '" + personName + '\'' +
                ", Цена: " + price + " руб." +
                ", Дата: '" + date + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return num == ticket.num && Double.compare(price, ticket.price) == 0 && Objects.equals(personName, ticket.personName) && Objects.equals(date, ticket.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, personName, price, date);
    }
}
