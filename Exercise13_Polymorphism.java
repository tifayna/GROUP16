public class Exercise13_Polymorphism {

    
    public static void transferMoney(BankAccount from, BankAccount to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transferred TZS " + amount + " from " + from.accountNumber + " to " + to.accountNumber);
    }

    public static void transferMoney(BankAccount from, BankAccount to, double amount, String description) {
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transferred TZS " + amount + " from " + from.accountNumber + " to " + to.accountNumber + " (" + description + ")");
    }

    public static void transferMoney(BankAccount from, String toAccountNumber, double amount, Bank bank) {
        BankAccount to = bank.findAccountByNumber(toAccountNumber);
        if (to != null) {
            transferMoney(from, to, amount);
        } else {
            System.out.println("Account " + toAccountNumber + " not found.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM TEST ===\n");

        
        SavingsAccount savings = new SavingsAccount("SAV001", "Ali Hassan", 500000, 0.05);
        CurrentAccount current = new CurrentAccount("CUR001", "Fatma Said", 1000000, 500000);
        FixedDepositAccount fixed = new FixedDepositAccount("FD001", "Omar Juma", 2000000, 0.08, 12);

        
        System.out.println("--- Testing Savings Account ---");
        savings.displayAccountInfo();
        savings.deposit(100000);
        savings.withdraw(50000);
        savings.applyInterest();
        savings.displayAccountInfo();

        
        System.out.println("\n--- Testing Current Account ---");
        current.displayAccountInfo();
        current.withdraw(1200000);  // Use overdraft
        System.out.println("Is overdrawn? " + current.isOverdrawn());
        current.displayAccountInfo();

        
        System.out.println("\n--- Testing Fixed Deposit ---");
        fixed.displayAccountInfo();
        fixed.withdraw(500000); // Should fail
        fixed.checkMaturity();
        fixed.withdraw(500000);
        System.out.println("Maturity amount: TZS " + fixed.getMaturityAmount());

        
        Bank bank = new Bank(10);
        bank.addAccount(savings);
        bank.addAccount(current);
        bank.addAccount(fixed);

        
        System.out.println("\n--- Bank Summary (Polymorphism) ---");
        bank.displayAllAccounts();
        System.out.println("Total Deposits: TZS " + bank.getTotalDeposits());
        System.out.println("Total Interest: TZS " + bank.getTotalInterest());

        
        System.out.println("\n--- Testing Transfers (Overloading) ---");
        transferMoney(savings, current, 50000);
        transferMoney(current, savings, 30000, "Rent payment");

        System.out.println("\n=== END OF TEST ===");
    }
}

