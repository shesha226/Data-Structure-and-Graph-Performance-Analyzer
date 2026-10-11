package src;

import java.util.Scanner;

public class CustomLinkedList {
    private Node head = null;

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
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
                    Node newNode = new Node(val);
                    if (head == null) head = newNode;
                    else {
                        Node temp = head;
                        while (temp.next != null) temp = temp.next;
                        temp.next = newNode;
                    }
                    System.out.println("Inserted successfully.");
                    break;
                case 2:
                    int delVal = InputValidator.getIntInput(scanner, "Enter value to delete: ");
                    if (head == null) { System.out.println("List is empty."); break; }
                    if (head.data == delVal) { head = head.next; System.out.println("Deleted successfully."); break; }
                    Node temp = head;
                    while (temp.next != null && temp.next.data != delVal) temp = temp.next;
                    if (temp.next != null) {
                        temp.next = temp.next.next;
                        System.out.println("Deleted successfully.");
                    } else System.out.println("Value not found.");
                    break;
                case 3:
                    int sVal = InputValidator.getIntInput(scanner, "Enter value to search: ");
                    Node curr = head;
                    int pos = 0;
                    boolean found = false;
                    while (curr != null) {
                        if (curr.data == sVal) {
                            System.out.println("Value found at position " + pos);
                            found = true;
                            break;
                        }
                        curr = curr.next;
                        pos++;
                    }
                    if (!found) System.out.println("Value not found.");
                    break;
                case 4:
                    if (head == null) System.out.println("Linked List is empty.");
                    else {
                        System.out.print("Linked List: ");
                        Node currNode = head;
                        while (currNode != null) {
                            System.out.print(currNode.data + " -> ");
                            currNode = currNode.next;
                        }
                        System.out.println("NULL");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}