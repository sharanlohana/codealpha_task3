/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplebankingapplication;
import java.util.Scanner;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;

public class SimpleBankingApplication {

    private static double balance = 0.0; // Account balance

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Welcome to Simple Banking Application ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using Simple Banking Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to handle deposit
    private static void deposit(Scanner scanner) {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + " to your account.");
            System.out.println("Your updated balance is: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to handle withdrawal
    private static void withdraw(Scanner scanner) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from your account.");
            System.out.println("Your updated balance is: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. You cannot withdraw more than $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to check current balance
    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}
