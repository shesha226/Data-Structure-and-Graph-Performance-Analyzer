package src;

import java.util.Scanner;

public class CustomStack {
    private int[] stack = new int[100];
    private int top = -1;

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            
            int choice = InputValidator.getIntInput(scanner, "Enter choice: ");

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    int val = InputValidator.getIntInput(scanner, "Enter value to push: ");
                    stack[++top] = val;
                    System.out.println("Pushed successfully.");
                    break;
                case 2:
                    if (top == -1) System.out.println("Error: Stack Underflow!");
                    else System.out.println("Popped element: " + stack[top--]);
                    break;
                case 3:
                    if (top == -1) System.out.println("Stack is empty.");
                    else System.out.println("Top element: " + stack[top]);
                    break;
                case 4:
                    if (top == -1) System.out.println("Stack is empty.");
                    else {
                        System.out.print("Stack elements: ");
                        for (int i = top; i >= 0; i--) System.out.print(stack[i] + " ");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}