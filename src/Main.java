package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayStructure arrayOps = new ArrayStructure();
        CustomStack stackOps = new CustomStack();
        CustomQueue queueOps = new CustomQueue();
        CustomLinkedList listOps = new CustomLinkedList();
        Graph graphOps = new Graph();
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();

        while (true) {
            System.out.println("\n==========================================");
            System.out.println("    DATA STRUCTURE & GRAPH ANALYZER       ");
            System.out.println("==========================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results Summary");
            System.out.println("9. Exit");

            int choice = InputValidator.getIntInput(scanner, "Enter your choice: ");

            switch (choice) {
                case 1: arrayOps.showMenu(scanner); break;
                case 2: stackOps.showMenu(scanner); break;
                case 3: queueOps.showMenu(scanner); break;
                case 4: listOps.showMenu(scanner); break;
                case 5:
                    int n = InputValidator.getIntInput(scanner, "\nEnter number of elements for array: ");
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
                    int target = InputValidator.getIntInput(scanner, "Enter target value to search: ");
                    
                    System.out.println("\n--- SEARCH RESULTS ---");
                    LinearSearch.search(arr, target);
                    int[] sortedArr = arr.clone();
                    Arrays.sort(sortedArr);
                    BinarySearch.search(sortedArr, target);
                    break;
                case 6: graphOps.showMenu(scanner); break;
                case 7: analyzer.runComparison(); break;
                case 8:
                    System.out.println("\n--- DISPLAY ALL RESULTS SUMMARY ---");
                    analyzer.runComparison();
                    break;
                case 9:
                    System.out.println("Exiting Application. Thank you!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}