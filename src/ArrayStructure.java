package src;

import java.util.Scanner;

public class ArrayStructure {
    private int[] arr = new int[100];
    private int size = 0;

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = scanner.nextInt();
                    if (size < arr.length) {
                        arr[size++] = val;
                        System.out.println("Inserted successfully.");
                    } else {
                        System.out.println("Array is full!");
                    }
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int delVal = scanner.nextInt();
                    int index = -1;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == delVal) { index = i; break; }
                    }
                    if (index != -1) {
                        for (int i = index; i < size - 1; i++) arr[i] = arr[i + 1];
                        size--;
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int sVal = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == sVal) {
                            System.out.println("Value found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Value not found.");
                    break;
                case 4:
                    if (size == 0) System.out.println("Array is empty.");
                    else {
                        System.out.print("Array elements: ");
                        for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}