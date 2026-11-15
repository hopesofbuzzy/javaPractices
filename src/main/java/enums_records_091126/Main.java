package enums_records_091126;

import java.time.Instant;

public class Main {
    static void main() {
        Point point = new Point(5, 5);
        System.out.println(point);
        point.x();

        // EventType t = new EventType();
        EventType type = EventType.CREATED;
        // ==
        Event created = new Event("AAA", EventType.CREATED, Instant.now());
        if (created.type() == EventType.CREATED) {
            System.out.println(created);
        }
        System.out.println(EventType.valueOf("CREATED"));
        System.out.println(EventType.REMOVED.ordinal());

        int expr = switch (created.type()) {
            case CREATED -> 0;
            case UPDATED -> 0;
            case REQUESTED -> 0;
            case REMOVED -> 0;
        };

        EventType[] types = EventType.values();
    }
}
