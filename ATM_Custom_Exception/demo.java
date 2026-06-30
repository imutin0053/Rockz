import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atm atm = new atm(1000);
        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        try {
            atm.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
