package src;

public class LinearSearch {
    public static int search(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Linear Search: Found at index " + i + " in " + steps + " steps.");
                return steps;
            }
        }
        System.out.println("Linear Search: Value not found (" + steps + " steps taken).");
        return steps;
    }
}