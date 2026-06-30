package Online_Paymet_System;

public class CreditCard implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private int cvv;
    private double amount;

    public CreditCard(String cardNumber, String cardHolderName, int cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
        System.out.printf("Card Holder Name: %s%n", cardHolderName);
        System.out.printf("Card Number: %s%n", cardNumber);
        System.out.printf("Card cvv: %d%n", cvv);
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment done Successfully!");
    }

}
