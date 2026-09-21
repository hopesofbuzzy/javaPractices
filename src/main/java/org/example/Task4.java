package org.example;
import java.util.Scanner;


public class Task4 {
    static void main() {
        // Вариант 3
        System.out.println("Вычисление ускорения по a = f / m");
        Scanner scanner = new Scanner(System.in);

        double force, mass;
        System.out.println("Введите силу f");
        try {
            force = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Введите число для силы!");
            return;
        }

        System.out.println("Введите массу m");
        try {
            mass = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Введите число для массы!");
            return;
        }

        if (mass == 0.0) {
            System.out.println("Ошибка валидации: масса равна нулю.");
            return;
        }

        System.out.printf("Ускорение: %f%n", force / mass);
    }
}
