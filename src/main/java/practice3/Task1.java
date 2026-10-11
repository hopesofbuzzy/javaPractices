package practice3;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int k = scanner.nextInt();
        for (int i = k - 1; i < a.length; i = i + k) {
            System.out.println(a[i]);
        }
    }
}
