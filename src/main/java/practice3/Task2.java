package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");

        int[] aInt = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aInt[i] = Integer.parseInt(a[i]);
        }

        int count = 0;
        for (int i = aInt.length - 1; i > 1; i--) {
            if (aInt[i-1] < aInt[i]) {
                System.out.println(i+1);
                count += 1;
            }
        }
    }
}
