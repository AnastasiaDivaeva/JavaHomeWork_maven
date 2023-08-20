package divaeva.hw1;

public class Task1 {
    public static void task1(float weight, int age) {
        String name = "Anastasia  ";
        System.out.println("Task 1  ");
        System.out.println("Name : " + name + ", Weight : " + weight + ", Age : " + age + ". ");
    }

    public static void task2(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Task 2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void task3(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("examples.Task3 ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    public static void main(String[] args) {
        task1(50, 24);
        task2(1, 2);
        task3(3, 5);
    }
}
