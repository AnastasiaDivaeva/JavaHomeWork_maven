package divaeva.hw12;


public class UtilityClass {
    public static <T> void printValue(T value) {
        System.out.println("***{" + value + "}***");
    }

    public <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

    public static void main(String[] args) {
        UtilityClass utilityClass = new UtilityClass();
        UtilityClass.printValue("Value");
        String[] strArray = {"Array", "Array 2"};
        utilityClass.printArray(strArray);
    }
}
