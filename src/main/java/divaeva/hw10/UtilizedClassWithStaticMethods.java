package divaeva.hw10;


import java.util.ArrayList;
import java.util.List;

public class UtilizedClassWithStaticMethods {
    public static int getSum(List<Integer> numeral) {
        int sum = 0;
        for (int i = 0; i < numeral.size(); i++) {
            sum += numeral.get(i);
        }
        return sum;

    }

    public static List<Integer> getOddNumber(List<Integer> numeral) {

        ArrayList<Integer> oddNumber = new ArrayList<>();
        for (int i = 0; i < numeral.size(); i++) {
            if (numeral.get(i) % 2 != 0) {
                oddNumber.add(numeral.get(i));
            }
        }
        return oddNumber;

    }

    public static List<String> convertToStringList(List<Integer> numeral) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < numeral.size(); i++) {
            stringList.add(numeral.get(i).toString());
        }
        return stringList;

    }

    public static List<String> doubling(List<String> name) {
        List<String> doublingList = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            doublingList.add(name.get(i) + name.get(i));
        }
        return doublingList;
    }
}



