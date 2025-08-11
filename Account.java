package Banking;

public class Account
{
    private int accountId;
    private String accountHolderName;
    private double balance;
    private String[] transactionHistory;
    private int transactionCount;

    public Account(int accountId, String accountHolderName, double initialDeposit)
    {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.transactionHistory = new String[100];
        this.transactionCount = 0;
        addTransaction("Account created with deposit: " + initialDeposit);
    }

    public int getAccountId() {
        return accountId;
    }



    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private void addTransaction(String details) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount++] = details;
        }
    }

    public void showTransactionHistory() {
        System.out.println("Transaction history for " + accountHolderName + ":");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionHistory[i]);
        }
    }
}

