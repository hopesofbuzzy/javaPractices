package enums_records_091126;

// Неизменяемый объект (все поля final)
// record - класс без наследования
// Может реализовывать интерфейсы

import java.time.Instant;
import java.util.Comparator;

public record Event(String name, EventType type, Instant time) implements Comparable<Event> {
    @Override
    public int compareTo(Event o) {
        return Comparator.<Event>comparingInt(e -> e.type.getPriority()).compare(this, o);
    }
}
