package src;

import java.util.Arrays;

public class PerformanceAnalyzer {
    public void runComparison() {
        System.out.println("\n========================================================");
        System.out.println("                PERFORMANCE COMPARISON                  ");
        System.out.println("========================================================");
        System.out.printf("%-18s | %-15s | %-12s | %-15s\n", "Operation", "Algorithm", "Steps", "Time (ns)");
        System.out.println("--------------------------------------------------------");

        int size = 1000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) data[i] = i;
        int target = 999;

        // Linear Search Performance
        long startLinear = System.nanoTime();
        int linearSteps = LinearSearch.search(data, target);
        long linearTime = System.nanoTime() - startLinear;

        // Binary Search Performance
        int[] sortedData = data.clone();
        Arrays.sort(sortedData);
        long startBinary = System.nanoTime();
        int binarySteps = BinarySearch.search(sortedData, target);
        long binaryTime = System.nanoTime() - startBinary;

        System.out.printf("%-18s | %-15s | %-12d | %-15d\n", "Search", "Linear Search", linearSteps, linearTime);
        System.out.printf("%-18s | %-15s | %-12d | %-15d\n", "Search", "Binary Search", binarySteps, binaryTime);
        System.out.println("--------------------------------------------------------");
        System.out.println("Explanation: Binary Search O(log n) requires significantly");
        System.out.println("fewer steps than Linear Search O(n) on sorted data.");
        System.out.println("========================================================\n");
    }
}