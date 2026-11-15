package practice5.Task1_2;

public class Human implements Destroyable {

    @Override
    public void destroy(String name) {
        System.out.printf("Человека убили! Убийца: %s\n", name);
    }
}
