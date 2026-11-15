package enums_records_091126;


// У класса только 4 экземпляра

public enum EventType {
    CREATED(-1),
    UPDATED(0),
    REQUESTED(1),
    REMOVED(2);

    private final int priority;

    EventType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
