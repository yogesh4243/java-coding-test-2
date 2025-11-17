class BankAccount {
    // Private balance field to encapsulate account balance
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Method to deposit amount (validates positive deposit)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw amount (validates positive amount and sufficient balance)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }

    // Getter to access current balance
    public double getBalance() {
        return balance;
    }

    // Main method to demonstrate banking operations
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);     // Expected output: Balance after deposit: 1500.0
        account.withdraw(200);    // Expected output: Balance after withdrawal: 1300.0
    }
}

