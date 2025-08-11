package Banking;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(100); // bank can store 100 accounts

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter initial deposit: ");
                    double deposit = sc.nextDouble();
                    bank.createAccount(id, name, deposit);
                    break;

                case 2:
                    System.out.print("Enter account ID: ");
                    id = sc.nextInt();
                    Account acc = bank.findAccount(id);
                    if (acc != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                        System.out.println("Amount Deposited Successfully");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account ID: ");
                    id = sc.nextInt();
                    acc = bank.findAccount(id);
                    if (acc != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account ID: ");
                    id = sc.nextInt();
                    acc = bank.findAccount(id);
                    if (acc != null) {
                        System.out.println("Balance: " + acc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter account ID: ");
                    id = sc.nextInt();
                    acc = bank.findAccount(id);
                    if (acc != null) {
                        acc.showTransactionHistory();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for banking with us!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
