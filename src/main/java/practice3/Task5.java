package practice3;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;


public class Task5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main() {
        boolean running = true;
        do {
            printMenu();
            int in = readInt();

            switch (in) {
                case 1 -> calculate();
                case 2 -> programInfo();
                case 3 -> developerInfo();
                case 4 -> {
                    running = false;
                }
                default -> System.out.println("Введите число от 1 до 4!");
            }
        } while (running);
    }

    private static void printMenu() {
        System.out.println("Вычисление ускорения по a = f / m");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
    }

    private static void developerInfo() {
        System.out.println("Разработчик: Нурбаев Данияр РИ-250911\n");
    }

    private static void programInfo() {
        System.out.println("Программа написана на JDK 26 (Java)\n");
    }

    private static void calculate() {
        double force, mass;
        System.out.println("Сила f и масса m.");
        double[] nums = readMultipleDoubles(2);
        force = nums[0];
        mass = nums[1];

        Optional<Double> accel = calcAccel(force, mass);
        if (accel.isEmpty()) {
            return;
        }
        System.out.printf("Ускорение: %f%n\n", accel.get());
    }

    private static Optional<Double> calcAccel(double force, double mass) {
        try {
            if (mass == 0) {
                throw new Exception("Масса должна быть больше нуля!");
            }
            return Optional.of(force / mass);
        } catch (Exception e) {
            return Optional.ofNullable(null);
        }
    }


    private static int readInt() {
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

    private static double[] readMultipleDoubles(int n) {
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

    private static void clearScanner() {
    }
}
