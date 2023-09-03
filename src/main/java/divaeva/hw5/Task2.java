package divaeva.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4};
        int[] arr1 = {4, 9, 6, 5, 4};

        boolean result = sorted(arr);
        System.out.println(result);

        boolean result1 = sorted(arr1);
        System.out.println(result1);
    }

    public static boolean sorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
