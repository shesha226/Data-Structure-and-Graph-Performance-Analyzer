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
            
            int choice = InputValidator.getIntInput(scanner, "Enter choice: ");

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    int val = InputValidator.getIntInput(scanner, "Enter value to insert: ");
                    arr[size++] = val;
                    System.out.println("Inserted successfully.");
                    break;
                case 2:
                    int delVal = InputValidator.getIntInput(scanner, "Enter value to delete: ");
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
                    int sVal = InputValidator.getIntInput(scanner, "Enter value to search: ");
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