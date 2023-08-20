package divaeva.hw10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numeral = new ArrayList<>();
        numeral.add(10);
        numeral.add(20);
        numeral.add(30);
        numeral.add(35);

        int sum = UtilizedClassWithStaticMethods.getSum(numeral);
        System.out.println("Get sum:" + sum);

        List<Integer> oddNumbers = UtilizedClassWithStaticMethods.getOddNumber(numeral);
        System.out.println("Odd Numbers: " + oddNumbers);

        List<String> stringList = UtilizedClassWithStaticMethods.convertToStringList(numeral);
        System.out.println("String List: " + stringList);

        List<String> name = new ArrayList<>();
        name.add("Sasha");
        name.add("Nasty");
        name.add("Lera");
        List<String> doublingString = UtilizedClassWithStaticMethods.doubling(name);
        System.out.println("Doubling:" + doublingString);
    }
}
