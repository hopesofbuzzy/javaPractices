package practice2;

public class Task1 {
    static void main() {
        double degree = 0;
        for (int i = 0; i < 18; i++) {
            degree = i * (Math.PI / 36);
            System.out.printf("tan(%d) = %f\n", i * 5, Math.tan(degree));
        }
    }
}
