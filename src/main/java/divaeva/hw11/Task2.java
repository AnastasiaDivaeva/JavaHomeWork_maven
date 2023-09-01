package divaeva.hw11;

import java.time.Duration;

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

        long elapsedTime = finishTime - startTime;
        System.out.println("Time Elapsed: " + elapsedTime + " ms");
        System.out.println("Time taken to fill " + collectionForBenchmarking.getClass().getSimpleName()
                + ": " + nano_secondsToSeconds(elapsedTime) + " s");
    }

    public static void benchmarkGetByIndex(List<Integer> collectionForBenchmarking) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < ITERATIONS; i++) {
            int randomIndex = random.nextInt(collectionForBenchmarking.size());
            collectionForBenchmarking.get(randomIndex);
        }
        long finishTimeGet = System.nanoTime();

        long elapsedTimeGet = finishTimeGet - startTime;
        System.out.println("Time Elapsed: " + elapsedTimeGet + " ns");
        System.out.println("Time taken to select random elements from "
                + collectionForBenchmarking.getClass().getSimpleName() + ": "
                + nano_secondsToSeconds(elapsedTimeGet) + " s");
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
