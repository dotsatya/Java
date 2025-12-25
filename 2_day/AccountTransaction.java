class Account {
    private String name;
    private int accountNumber;
    private char accountType;
    private double balance;
    private static int transactionCount = 0;

    public Account(String name, int accountNumber, char accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            transactionCount++;
        } else {
            System.out.println("Insufficient balance to withdraw.");
        }
    }

    public static int getTransactionCount() {
        return transactionCount;
    }

    public String toString() {
        return "Name: " + name + ", Balance: " + balance;
    }
}

public class AccountTransaction {
    public static void main(String[] args) {
        Account acc = new Account("Satya", 12345, 'S', 6000);
        acc.deposit(2500);
        acc.withdraw(1500);
        acc.withdraw(3000);
	acc.withdraw(4000);

        System.out.println(acc);
        System.out.println("Total Transactions: " + Account.getTransactionCount());
    }
}
