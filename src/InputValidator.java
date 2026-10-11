package src;

import java.util.Scanner;

public class InputValidator {
    public static int getIntInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        return input;
    }
}