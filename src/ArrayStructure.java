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