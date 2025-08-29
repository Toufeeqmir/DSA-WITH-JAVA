import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements BankAccount {
    private double balance;

    public SavingsAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Create account with initial balance
            System.out.print("Enter initial balance: ");
            double initialBalance = Double.parseDouble(sc.nextLine());
            SavingsAccount account = new SavingsAccount(initialBalance);

            // Deposit
            System.out.print("Enter deposit amount: ");
            double depositAmount = Double.parseDouble(sc.nextLine());
            account.deposit(depositAmount);

            // Withdraw
            System.out.print("Enter withdraw amount: ");
            double withdrawAmount = Double.parseDouble(sc.nextLine());
            account.withdraw(withdrawAmount);

            // Show Balance
            System.out.println("Current Balance: " + account.getBalance());

            // Example of ArithmeticException (optional simulation)
            System.out.print("Enter a number to divide balance by: ");
            int divisor = Integer.parseInt(sc.nextLine());
            double result = account.getBalance() / divisor;  // may throw ArithmeticException
            System.out.println("Balance divided by " + divisor + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        } finally {
            sc.close();
        }
    }
}
