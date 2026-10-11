package practice3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        int k = scanner.nextInt();

        int[] aInt = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aInt[i] = Integer.parseInt(a[i]);
        }

        System.out.println(getToK(aInt, k));
    }

    static int getToK(int[] a, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        return sum;
    }
}
