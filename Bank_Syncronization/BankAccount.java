package Bank_Syncronization;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw Rs." + amount);
        if (balance >= amount) {
            System.out.println("Withdraw Successful!");
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

}
