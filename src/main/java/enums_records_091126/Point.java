package enums_records_091126;

// Неизменяемый объект (все поля final)
// record - класс без наследования
// Может реализовывать интерфейсы

public record Point(double x, double y) implements Comparable<Point> {

    public Point {
        // x y - параметры, которые были переданы, можно провести валидацию
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }
        // this.x = x;
        // this.y = y;
    }

    public Point(double a) {
        this(a, a);
    }

    public Point negate() {
        return new Point(-x, -y);
    }

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}
