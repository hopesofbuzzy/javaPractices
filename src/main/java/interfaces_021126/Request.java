package interfaces_021126;

// Реализация есть в НЕАБСТРАКТНОМ классе
public abstract class Request implements Comparable<Request> {
    private final long id;
    private final int priority;

    public Request(long id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public abstract String getDetails();

    @Override
    public int compareTo(Request o) {
        return Integer.compare(priority, o.priority);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", priority=" + priority +
                '}';
    }
}
