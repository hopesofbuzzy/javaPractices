package practice1;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task123 {
    static void main() {
        // Вариант 3
        // Задание 1
        byte g = 127;
        String b = "8282";
        int num = 10;
        double caseOne = 2.0;
        boolean byteOne = true;
        char i = 's';
        double str = 7175.18071092876936384;
        char letter = 'Z';
        String gora = "Гора";
        char iLetter = 'i';
        String string = "force";
        double l = 6140.5363399683968239;
        short r = 9583;
        String guitar = "гитара";
        char y = 'i';

        // Задание 2
        System.out.println(f(0));

        // Задание 3
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("2");
        } else if (firstNumber < secondNumber){
            System.out.println("1");
        } else {
            System.out.println("Числа равны");
        }
    }

    static double f(double x) {
        return -16 * Math.pow(x, 2) + Math.pow(x, 4) - 23 * x - 55;
    }
}
