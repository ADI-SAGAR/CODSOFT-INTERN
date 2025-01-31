import java.util.Scanner;

// Class to represent the Bank Account
class BankAccount {
    private double balance;

    // Constructor to initialize account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to get the current balance
    public double getBalance() {
        return this.balance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// ATM Class to interact with the BankAccount
class ATM {
    private BankAccount account;
    private Scanner scanner;

    // Constructor that takes a BankAccount object
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    // it  display's the menu
    public void start() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you ");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
    }
}

// Main class to run the ATM
public class Atminterface {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Start with an initial balance of 500
        ATM atm = new ATM(account);
        atm.start(); // Start the ATM interaction
    }
}
