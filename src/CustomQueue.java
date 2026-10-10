package src;

import java.util.Scanner;

public class CustomQueue {
    private int[] queue = new int[100];
    private int front = 0, rear = 0;

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek/Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            
            int choice = InputValidator.getIntInput(scanner, "Enter choice: ");

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    int val = InputValidator.getIntInput(scanner, "Enter value to enqueue: ");
                    queue[rear++] = val;
                    System.out.println("Enqueued successfully.");
                    break;
                case 2:
                    if (front == rear) System.out.println("Error: Queue Underflow!");
                    else System.out.println("Dequeued element: " + queue[front++]);
                    break;
                case 3:
                    if (front == rear) System.out.println("Queue is empty.");
                    else System.out.println("Front element: " + queue[front]);
                    break;
                case 4:
                    if (front == rear) System.out.println("Queue is empty.");
                    else {
                        System.out.print("Queue elements: ");
                        for (int i = front; i < rear; i++) System.out.print(queue[i] + " ");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}