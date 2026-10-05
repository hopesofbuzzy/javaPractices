package practice2;
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
        System.out.println("Введите силу f");
        force = readDouble();

        System.out.println("Введите массу m");
        mass = readDouble();

        if (mass == 0.0) {
            System.out.println("Ошибка валидации: масса равна нулю.");
            return;
        }

        System.out.printf("Ускорение: %f%n\n", force / mass);
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

    private static double readDouble() {
        System.out.print("Ваш выбор: ");
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Введите вещественное число!");
                scanner.next();
            }
        }
    }
}
