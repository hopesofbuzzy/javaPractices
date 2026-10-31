package practice4.Task1;

import java.util.Arrays;

public class DoubleList {
    private double[] list;

    static void main() {
        DoubleList dl1 = new DoubleList(5);
        dl1.index(0, 5);
        dl1.index(4, 3);
        System.out.println(dl1);
        DoubleList dl2 = new DoubleList(0);

    }

    public DoubleList(int length) {
        if (length == 0) {
            throw new IllegalArgumentException("Некорректное значение");
        }
        this.list = new double[length];
    }

    public void index(int idx, double val) {
        if (idx >= list.length) {
            throw new IllegalArgumentException("Некорректный индекс!");
        }
        list[idx] = val;
    }

    public int getLength() {
        return list.length;
    }

    public double max() {
        double max = Double.NEGATIVE_INFINITY;
        for (double val : list) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public double min() {
        double min = Double.POSITIVE_INFINITY;
        for (double val : list) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public double mean() {
        double sum = 0;
        for (double val : list) {
            sum += val;
        }
        return sum / list.length;
    }

    public double geometricMean() {
        double product = 1;
        for (double val : list) {
            if (val > 0) {
                product *= val;
            }
        }
        return Math.pow(product, 1.0d / list.length);
    }

    @Override
    public String toString() {
        return "DoubleList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
