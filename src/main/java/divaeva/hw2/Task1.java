package divaeva.hw2;

public class Task1 {
    public static void task1(int x1, int y1, int x2, int y2, int x3, int y3) {
        int sum = ((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
        System.out.println("S = " + sum);
    }

    public static void task2(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Even number");
        } else {
            System.out.println(number + " Noy even ");
        }
    }

    public static void task3(double num1, double num2, double num3) {
        double num1Absolute = Math.abs(num1);
        double num2Absolute = Math.abs(num2);
        double num3Absolute = Math.abs(num3);

        double minNumber = Math.min(num1Absolute, num2Absolute);
        double minNum = Math.min(minNumber, num3Absolute);
        System.out.println(minNum);
    }

    public static void main(String[] args) {
        task1(1, 5, 3, 5, 6, 7);
        task2(56);
        task3(-5.5, -11, 7);
    }
}
