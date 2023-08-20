package divaeva.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] inputRandomValues = generateRandomArray(2000, 1, 2000);
        int[] modifiedArray = replaceEvenNumbersWithZero(inputRandomValues);
        printArray(modifiedArray);
    }
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] randomArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return randomArray;
    }

    public static int[] replaceEvenNumbersWithZero(int[] array) {
        int[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return copiedArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}



