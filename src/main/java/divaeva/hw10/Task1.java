package divaeva.hw10;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println("Using for loop:");
        for (int i = 0; i < number.size(); i++) {
            Integer numbers = number.get(i);
            System.out.println(numbers);
        }

        System.out.println("Using for-eah loop:");
        for (Integer numbers : number) {
            System.out.println(numbers);
        }

        System.out.println("Using while loop: ");
        int index=0;
        while (index<number.size()){
            Integer numbers= number.get(index);
            System.out.println(numbers);
            index++;
        }
        System.out.println("Using iterator :");
        Iterator<Integer>iterator= number.iterator();
        while (iterator.hasNext()){
            Integer numbers=iterator.next();
            System.out.println(numbers);
        }

    }
}
