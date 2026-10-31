package practice4.Task3_4;

import java.util.Arrays;
import java.util.Scanner;

// Чтение и валидация данных.
public class Reader {
    static Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        System.out.print("Ваш выбор: ");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите целое число!");
                scanner.next();
            }
        }
    }

    public static double[] readMultipleDoubles(int n) {
        System.out.printf("Введите n=%d вещественных чисел через пробел: \n", n);
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (true) {
            try {
                String[] nums = scanner.nextLine().split(" ");
                System.out.println(Arrays.toString(nums));
                if (nums.length != n) {
                    throw new Exception("Введите n чисел");
                }

                double[] result = new double[nums.length];
                for (int i = 0; i < nums.length; i++) {
                    result[i] = Double.parseDouble(nums[i]);
                }
                return result;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}