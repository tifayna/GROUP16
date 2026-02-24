public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
//constructor
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew TZS " + amount + ". New balance: TZS " + balance);
        } else {
            System.out.println("Cannot withdraw TZS " + amount + ". Overdraft limit exceeded.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }
//method
    public boolean isOverdrawn() {
        return balance < 0;
    }
}
