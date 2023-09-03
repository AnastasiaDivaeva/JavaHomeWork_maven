package divaeva.hw9;

public class ExampleTask1 {
    public static void main(String[] args) {
        try {
            throw new Exception("There may be an exception");
        } catch (Exception e) {
            System.out.println("Exception approved " + e.getMessage());
        } finally {
            System.out.println("Entered this block");
        }
    }
}


