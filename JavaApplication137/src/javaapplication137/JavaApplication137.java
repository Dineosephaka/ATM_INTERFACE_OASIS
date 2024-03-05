/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication137;
import java.util.Scanner;



/**
 *
 * @author 27659
 */
public class JavaApplication137 {
private static int balance = 10000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM Interface!");
         System.err.println("Please enter your user ID:");
        String userId = sc.nextLine();

         System.err.println("Please enter your user PIN:");
        String userPin = sc.nextLine();

        if (authenticateUser(userId, userPin)) {
            displayMenu();
        } else {
            System.out.println("Authentication failed. Exiting...");
        }
    }

    private static boolean authenticateUser(String userId, String userPin) {
        // You can implement actual user authentication logic here
        // For demonstration purposes, let's assume any input is valid
        return true;
    }

    private static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("***********************************************************************");
            System.out.println("\nATM Menu:");
            System.out.println("1. View Transactions History");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Transfer Funds");
            System.out.println("5. Quit");

             System.err.println("Enter your choice:  " );
            System.out.println("***********************************************************************");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewTransactionsHistory();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    transferFunds();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    System.exit(0);
                default:
                     System.err.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewTransactionsHistory() {
        // Implement transaction history display logic
         System.err.println("Transaction history not available.");
    }

    private static void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
         System.err.println("Enter the amount to withdraw: ");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withrawal successful. Updated balance: " + balance);
        }
    }

    private static void depositMoney() {
        Scanner sc = new Scanner(System.in);
         System.err.println("Enter the amount to deposit: ");
        int depositAmount = sc.nextInt();

        balance += depositAmount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    private static void transferFunds() {
        // Implement fund transfer logic
       
        Scanner sc = new Scanner(System.in);
         System.err.println("Enter the amount to transfer: ");
        int transAmount = sc.nextInt();

        if (transAmount > balance) {
             System.err.println("Insufficient balance.");
        } else {
            balance -= transAmount;
            System.out.println("tranfer successful. Updated balance: " + balance);
    }
}
}
    
