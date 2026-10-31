package practice4.Task2;

import java.util.Objects;

public class AirTicket extends Ticket {
    boolean isSpecialClass;
    String dest;
    double distance;

    public AirTicket(int num, String personName, double price, String date, boolean isSpecialClass, String dest, double distance) {
        super(num, personName, price, date);
        this.isSpecialClass = isSpecialClass;
        this.dest = dest;
        this.distance = distance;
    }

    // price = price * distance (* 1.5 если isSpecialClass)
    public double calculateFinalPrice() {
        double finalPrice = super.calculateFinalPrice() * distance;
        if (isSpecialClass) {
            finalPrice *= 1.5;
        }
        return finalPrice;
    }

    @Override
    public String getDescription() {
        return toString() + "\nДетали: Билет на самолёт! Есть бизнес-класс!";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", Бизнес-класс: " + isSpecialClass +
            ", Расстояние: " + distance +
            ", Куда: '" + dest + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirTicket airTicket = (AirTicket) o;
        return isSpecialClass == airTicket.isSpecialClass && Double.compare(distance, airTicket.distance) == 0 && Objects.equals(dest, airTicket.dest);
    }
}
