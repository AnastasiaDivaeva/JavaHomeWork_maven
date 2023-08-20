package divaeva.hw11;

import java.util.*;

public class Task1 {
    public static Map<String, Integer> lineNumber(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            String removeSpaces = str.replace(" ", "");
            int length = removeSpaces.length();
            result.put(str, length);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("тут", "там", "стол", "стол и стул");
        Map<String, Integer> result = lineNumber(strings);
        List<String> keys = new ArrayList<>(result.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            int value = result.get(key);
            System.out.println("{" + key + "," + value + "}");

        }

    }
}
