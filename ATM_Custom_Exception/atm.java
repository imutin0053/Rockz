import javax.naming.InsufficientResourcesException;

public class atm extends Throwable {
    protected double balance;

    public atm(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Sucessfully");
            System.out.println("Remaining Balance: " + balance);
        }
    }

}
