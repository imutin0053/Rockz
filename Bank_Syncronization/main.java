package Bank_Syncronization;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(10000);
        Customer c1 = new Customer(acc, 5000, "Rockz");
        Customer c2 = new Customer(acc, 4000, "Xebec");
        c1.start();
        c2.start();
    }

}
