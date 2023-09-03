package divaeva.hw12;

public class Demo {


    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>(5);
        mySet.add(1);
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
//        mySet.add(4);
//        mySet.add(5);
//        mySet.add(6);
//        mySet.add(7);
//        mySet.add(8);
//        mySet.add(9);
//        mySet.add(10);


        System.out.println(mySet);
        MySet<String>mySet2=new MySet<>(4);
        mySet2.add("one");
        mySet2.add("two");
        mySet2.add("three");
        mySet2.add("three");
        System.out.println(mySet2);

        String m = mySet2.get(2);
        String m1 = mySet2.get(-1);
        String m2 = mySet2.get(10);
        System.out.println(m);
    }
}
