package Online_Paymet_System;

public class UPI implements Payment {
    private String upiId;
    private String upiPin;
    private double amount;

    public UPI(String upiId, String upiPin, double amount) {
        this.upiId = upiId;
        this.upiPin = upiPin;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("UPI Payment");
        System.out.printf("UPI ID: %s%n", upiId);
        System.out.printf("UPI PIN: %s%n", upiPin);
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment done Successfully!");
    }
}
