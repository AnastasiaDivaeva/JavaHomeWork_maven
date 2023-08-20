package divaeva.hw9;

public class ExampleTask2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (RuntimeException e) {
            System.out.println("An exception was caught in main:" + e.getMessage());
        }
    }

    private static void f() {
        try {
            g();
        } catch (RuntimeException e) {
            System.out.println("An exception was caught in f:" + e.getMessage());
            throw new IllegalArgumentException("");
        }
    }

    private static void g() {
        throw new RuntimeException("Exception in g");
    }

}
