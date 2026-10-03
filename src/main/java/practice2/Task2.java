package practice2;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = 0;
        double literal = 1.1;
        for (int i = 0; i < n; i++) {
            result += literal * Math.pow(-1, i);
            literal = literal + 0.1;
            System.out.println(result);
        }
    }
}
