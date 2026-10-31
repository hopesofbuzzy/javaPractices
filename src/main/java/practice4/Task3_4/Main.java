package practice4.Task3_4;


public class Main {
    public static void main() {
        boolean running = true;
        do {
            printMenu();
            int in = Reader.readInt();

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
        double[] nums = Reader.readMultipleDoubles(2);
        force = nums[0];
        mass = nums[1];

        Formula accel = new AccelerationFormula(force, mass);
        System.out.printf("Ускорение: %f%n\n", accel.calculate());
    }
}
