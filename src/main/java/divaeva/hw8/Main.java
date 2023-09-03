package divaeva.hw8;

public class Main {
    public static void main(String[] args) {
        Pow powFuncional = (number,pow)->{
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };

        System.out.println(powFuncional.pow(2, 5));
    }
}
