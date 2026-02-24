public class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
//create constructor with parameters
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
//methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited TZS " + amount + ". New balance: TZS " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew TZS " + amount + ". New balance: TZS " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw TZS " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: TZS " + balance);
        System.out.println("Account Type: " + this.getClass().getSimpleName());
    }

    public double calculateInterest() {
        return 0; // Base implementation
    }
}
