public class SavingsAccount extends BankAccount {
    private double interestRate;
//constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 10000) { // Minimum balance TZS 10,000
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw TZS " + amount + ". Minimum balance of TZS 10,000 must be maintained.");
        }
    }
//method 
    public void applyInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest of TZS " + interest + " applied. New balance: TZS " + balance);
    }
}
