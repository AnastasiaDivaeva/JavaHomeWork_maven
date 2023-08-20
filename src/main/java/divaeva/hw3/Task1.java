package divaeva.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        char[] userInputArray = userInput.toCharArray();
        char[] result = removeSpaces(userInputArray);

        System.out.println(result);

        if (isPalindrome(result)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static char[] removeSpaces(char[] userInputArray) {
        StringBuilder result = new StringBuilder();

        for (char symbol : userInputArray) {
            if (symbol != ' ') {
                result.append(symbol);
            }
        }

        return result.toString().toCharArray();
    }

    public static boolean isPalindrome(char[] str) {
        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            if (str[left] != str[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

