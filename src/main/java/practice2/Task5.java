package practice2;
import java.util.Scanner;


public class Task5 {
    static void main() {
        // Вариант 3
        // Заданиу 4
        Scanner scanner = new Scanner(System.in);
        int in = -1;
        while (in != 4) {
            System.out.println("Вычисление ускорения по a = f / m");
            System.out.println("1. Выполнить расчёт");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("4. Выход");
            in = readInt(scanner);

            switch (in) {
                case 1:
                    calculate(scanner);
                    break;
                case 2:
                    programInfo();
                    break;
                case 3:
                    developerInfo();
                    break;
                case 4: return;
                default: System.out.println("Введите число от 1 до 4!");
            }
        }
    }

    static void developerInfo() {
        System.out.println("Разработчик: Нурбаев Данияр РИ-250911\n");
    }

    static void programInfo() {
        System.out.println("Программа написана на JDK 26 (Java)\n");
    }

    static void calculate(Scanner scanner) {
        double force, mass;
        System.out.println("Введите силу f");
        force = readDouble(scanner);

        System.out.println("Введите массу m");
        mass = readDouble(scanner);

        if (mass == 0.0) {
            System.out.println("Ошибка валидации: масса равна нулю.");
            return;
        }

        System.out.printf("Ускорение: %f%n\n", force / mass);
    }

    static int readInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите целое число!");
                scanner.next();
            }
        }
    }

    static double readDouble(Scanner scanner) {
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
