package exceptions;

public class Main {
    static void main() {
        try {
            throw new SimpleException("Hello!");
        } catch (SimpleException e) {
            System.out.println(e.getMessage());
        }
    }
}
