package src;

public class BinarySearch {
    public static int search(int[] sortedArr, int target) {
        int steps = 0;
        int low = 0, high = sortedArr.length - 1;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;
            if (sortedArr[mid] == target) {
                System.out.println("Binary Search: Found at index " + mid + " in " + steps + " steps.");
                return steps;
            }
            if (sortedArr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Binary Search: Value not found (" + steps + " steps taken).");
        return steps;
    }
}