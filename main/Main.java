package main;

import banking.Bank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accHolderName = scanner.nextLine();
                    bank.openAccount(accNumber, accHolderName);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(accNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accNumber = scanner.nextLine();
                    bank.checkBalance(accNumber);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Add a new line for better readability
        }
    }
}
