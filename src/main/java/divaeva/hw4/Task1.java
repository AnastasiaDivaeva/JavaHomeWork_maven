package divaeva.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 11;

        int[] inputRandomValues = generateRandomArray(minValue, maxValue, 400);

        double arithmeticAverage = calculateArithmeticAverage(inputRandomValues);
        System.out.println("arithmetic average: " + (int) arithmeticAverage);

        double geometricAverage = calculateGeometricAverage(inputRandomValues);
        System.out.println("geometric average: " + (int) geometricAverage);
    }

    public static int[] generateRandomArray(int minValue, int maxValue, int length) {
        int[] randomArray = new int[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = rand.nextInt(maxValue - minValue + 1) + minValue;
        }

        return randomArray;
    }

    public static double calculateArithmeticAverage(int[] array) {
        double sum = 0;
        for (int x : array) {
            sum += x;
        }

        return sum / array.length;
    }

    public static double calculateGeometricAverage(int[] array) {
        double geometric = 1;
        for (int x : array) {
            geometric *= x;
        }

        return Math.pow(geometric, 1.0 / array.length);
    }
}
