package Online_Paymet_System;

import java.util.Scanner;

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Credit Card\n2.UPI\n3.Net Banking\n");
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Card Holder Name: ");
                String holder = sc.nextLine();
                System.out.print("Enter Card Number: ");
                String num = sc.nextLine();
                System.out.print("Enter cvv: ");
                int cvv = sc.nextInt();
                System.out.print("Enter Amount: ");
                double amount = sc.nextDouble();
                CreditCard creditcard = new CreditCard(num, holder, cvv, amount);
                creditcard.pay();
                break;
            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                System.out.print("Enter UPI PIN: ");
                String upiPin = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amount2 = sc.nextDouble();
                UPI upi = new UPI(upiId, upiPin, amount2);
                upi.pay();
                break;
            case 3:
                System.out.print("Enter Bank Name: ");
                String bankName = sc.nextLine();
                System.out.print("Enter User Name: ");
                String userName = sc.nextLine();
                System.out.print("Enter Password: ");
                String password = sc.nextLine();
                System.out.print("Enter Amount: ");
                double amount3 = sc.nextDouble();
                NetBanking netBanking = new NetBanking(bankName, userName, password, amount3);
                netBanking.pay();
                break;
            default:
                System.out.println("Invalid Choice!");
                break;

        }
        sc.close();
    }
}
