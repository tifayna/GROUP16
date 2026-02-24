public class FixedDepositAccount extends BankAccount {
    private double interestRate;
    private int maturityMonths;
    private boolean isMatured;
//constructor
    public FixedDepositAccount(String accountNumber, String accountHolder, double balance, double interestRate, int maturityMonths) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
        this.maturityMonths = maturityMonths;
        this.isMatured = false;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate * (maturityMonths / 12.0);
    }

    @Override
    public void withdraw(double amount) {
        if (isMatured) {
            super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw TZS " + amount + ". Fixed deposit not matured.");
        }
    }
//method
    public void checkMaturity() {
        // For simplicity, we assume account matures immediately
        isMatured = true;
        System.out.println("Fixed Deposit " + accountNumber + " has matured.");
    }

    public double getMaturityAmount() {
        return balance + calculateInterest();
    }
}

