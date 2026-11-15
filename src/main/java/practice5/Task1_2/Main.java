package practice5.Task1_2;

public class Main {
    static void main() {
        Destroyable[] items = new Destroyable[] {
                new Human(),
                new Tower()
        };
        for (Destroyable item : items) {
            item.destroy("Игрок 1");
        }
    }
}
