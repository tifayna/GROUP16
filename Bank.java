public class Bank {
    private BankAccount[] accounts;
    private int index;

    public Bank(int size) {
        accounts = new BankAccount[size];
        index = 0;
    }

    public void addAccount(BankAccount account) {
        if (index < accounts.length) {
            accounts[index++] = account;
        }
    }

    public double getTotalDeposits() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += accounts[i].getBalance();
        }
        return total;
    }

    public double getTotalInterest() {
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += accounts[i].calculateInterest();
        }
        return total;
    }

    public void displayAllAccounts() {
        for (int i = 0; i < index; i++) {
            accounts[i].displayAccountInfo();
            System.out.println();
        }
    }

    public BankAccount findAccountByNumber(String accNum) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].accountNumber.equals(accNum)) {
                return accounts[i];
            }
        }
        return null;
    }
}

