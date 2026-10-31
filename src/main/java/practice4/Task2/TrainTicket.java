package practice4.Task2;

import java.util.Objects;

public class TrainTicket extends Ticket {
    int carriage;
    int place;
    String dest;
    double distance;

    public TrainTicket(int num, String personName, double price, String date, int carriage, int place, String dest, double distance) {
        super(num, personName, price, date);
        this.carriage = carriage;
        this.place = place;
        this.dest = dest;
        this.distance = distance;
    }

    // price = price * distance
    public double calculateFinalPrice() {
        return super.calculateFinalPrice() * distance;
    }

    @Override
    public String getDescription() {
        return toString() + "\nДетали: Билет на поезд! Станция Смешарово.";
    }

    @Override
    public String toString() {
        return super.toString() +
            ", Вагон: " + carriage +
            ", Место: " + place +
            ", Куда: '" + dest + '\'' +
            ", Расстояние: " + distance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TrainTicket that = (TrainTicket) o;
        return carriage == that.carriage && place == that.place && Objects.equals(dest, that.dest);
    }
}
