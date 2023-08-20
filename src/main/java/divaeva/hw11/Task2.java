package divaeva.hw11;

import java.util.*;

public class Task2 {

    private static Integer ITERATIONS = 100000;

    public static void benchmarkAddsToList(Collection<Integer> collectionForBenchmarking) {
        long startTime;
        long finishTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            collectionForBenchmarking.add(i);
        }
        finishTime = System.nanoTime();
        System.out.println("Time taken to fill " + collectionForBenchmarking.getClass().getSimpleName()
                + ": " + nano_secondsToSeconds(finishTime - startTime));
    }

    public static void benchmarkGetByIndex(List<Integer> collectionForBenchmarking) {
        long startTime;
        long finishTime;
        Random random = new Random();

        startTime = System.nanoTime();
        for (int i = 0; i < ITERATIONS; i++) {
            int randomIndex = random.nextInt(collectionForBenchmarking.size());
            collectionForBenchmarking.get(randomIndex);
        }
        finishTime = System.nanoTime();
        System.out.println("Time taken to select random elements from "
                + collectionForBenchmarking.getClass().getSimpleName() + ": "
                + nano_secondsToSeconds(finishTime - startTime));

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        benchmarkAddsToList(arrayList);
        benchmarkAddsToList(linkedList);

        benchmarkGetByIndex(arrayList);
        benchmarkGetByIndex(linkedList);
    }

    public static double nano_secondsToSeconds(long nanos) {
        return nanos / 1e9;
    }
}
