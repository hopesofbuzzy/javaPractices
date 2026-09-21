package practice1;
import java.util.Scanner;

public class Task3 {
    static int getLessNumber(int a, int b) {
        // Выводит номер наименьшего из чисел (порядковый).
        if (a > b) {
            return 2;
        } else {
            return 1;
        }
    }

    static void main() {
        // Вариант 3
        // Задание 3
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(getLessNumber(firstNumber, secondNumber));
    }
}
