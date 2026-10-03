package practice2;

import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
