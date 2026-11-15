package practice5.Task1_2;

public class Tower implements Destroyable {

    @Override
    public void destroy(String name) {
        System.out.printf("Башня была уничтожена! Уничтожитель: %s\n", name);
    }
}
