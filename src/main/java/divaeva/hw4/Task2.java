package divaeva.hw4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] inputRandomValues = new int[1000];
        Random random = new Random();
        int minValue = 1;
        int maxValue = 1000;
        int countOfPrimes = 0;

        for (int i = 0; i < inputRandomValues.length; i++) {
            inputRandomValues[i] = random.nextInt(maxValue - minValue) + minValue;
            if (isPrime(inputRandomValues[i])) {
                countOfPrimes++;
            }
        }

        System.out.println("The number of primes in the array:" + countOfPrimes);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



