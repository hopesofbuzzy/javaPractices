package Stack;

public class Action {
    private final String name;

    public Action(String name) {
        this.name = name;
    }

    public String describe() {
        return "Действие: " + name;
    }
}
