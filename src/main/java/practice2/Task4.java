package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String[] coords = scanner.nextLine().split(" ");
        double[] dcoords = new double[6];
        for (int i = 0; i < coords.length; i++) {
            dcoords[i] = Integer.parseInt(coords[i]);
        }

        System.out.println(dist(dcoords[0], dcoords[1], dcoords[2], dcoords[3], dcoords[4], dcoords[5]));
    }

    static double dist(
            double x1, double y1, double z1, double x2, double y2, double z2
    ) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
    }
}
