package practice6;


import java.util.ArrayList;

public class Main {
    public static ArrayList<Body> bodies = new ArrayList<>();

    public static void main() {
        boolean running = true;
        do {
            printMenu();
            MenuActionType choice = MenuActionType.values()[Reader.readInt()-1];

            switch (choice) {
                case MenuActionType.CREATE_BODY -> createBody();
                case MenuActionType.CALCULATE_BODY -> calculateBody();
                case MenuActionType.PROGRAM_INFO -> programInfo();
                case MenuActionType.DEVELOPER_INFO -> developerInfo();
                case MenuActionType.EXIT -> {
                    running = false;
                }
                default -> System.out.println("Введите число от 1 до 4!");
            }
        } while (running);
    }

    private static void printMenu() {
        System.out.println("Вычисление значений тела.");
        System.out.println("1. Создать тело");
        System.out.println("2. Рассчитать тело");
        System.out.println("3. Информация о программе");
        System.out.println("4. Информация о разработчике");
        System.out.println("5. Выход");
    }

    private static void developerInfo() {
        System.out.println("Разработчик: Нурбаев Данияр РИ-250911\n");
    }

    private static void programInfo() {
        System.out.println("Программа написана на JDK 26 (Java)\n");
    }

    private static void calculateBody() {
        System.out.println("Доступные тела (от 0).");
        int index = 0;
        for (Body body : bodies) {
            System.out.printf("%d = %s \n", index, body);
            index++;
        }
        System.out.println("Выберите тело для расчёта.");
        int bodyChoice = Reader.readInt();
        System.out.println("Выберите формулу для расчёта.");
        System.out.println("1. Ускорение");
        System.out.println("2. Кинетическая энергия");
        int formulaChoice = Reader.readInt();
        switch (FormulaType.values()[formulaChoice-1]) {
            case FormulaType.ACC -> accCalculate(bodies.get(bodyChoice));
            case FormulaType.KIN -> kinemCalculate(bodies.get(bodyChoice));
        }
    }

    private static void createBody() {
        System.out.println("Введите силу, скорость и массу.");
        double[] nums = Reader.readMultipleDoubles(3);
        double force = nums[0];
        double velocity = nums[1];
        double mass = nums[2];
        Main.bodies.add(new Body(force, velocity, mass));
    }

    private static void accCalculate(Body body) {
        Formula accel = new AccelerationFormula(body);
        System.out.printf("Ускорение: %f%n\n", accel.calculate());
    }

    private static void kinemCalculate(Body body) {
        Formula accel = new KinematicEnergyFormula(body);
        System.out.printf("Энергия: %f%n\n", accel.calculate());
    }
}
