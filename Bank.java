package Banking;


public class Bank {
    private Account[] accounts;
    private int accountCount;

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        accountCount = 0;
    }

    public void createAccount(int id, String name, double deposit) {
        accounts[accountCount++] = new Account(id, name, deposit);
        System.out.println("Account created successfully!");
    }

    public Account findAccount(int id) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountId() == id) {
                return accounts[i];
            }
        }
        return null;
    }
}
