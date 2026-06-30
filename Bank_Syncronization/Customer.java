package Bank_Syncronization;

public class Customer extends Thread {
    private BankAccount account;
    private double amount;

    public Customer(BankAccount account, double amount, String name) {
        this.account = account;
        this.amount = amount;
        setName(name);
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
