package Online_Paymet_System;

public class NetBanking implements Payment {
    private String bankName;
    private String userName;
    private String password;
    private double amount;

    public NetBanking(String bankName, String userName, String password, double amount) {
        this.bankName = bankName;
        this.userName = userName;
        this.password = password;
        this.amount = amount;
    }

    @Override
    public void pay() {
        System.out.println("Net Banking Payment");
        System.out.printf("Bank Name: %s%n", bankName);
        System.out.printf("User Name: %s%n", userName);
        System.out.printf("Password: %s%n", password);
        System.out.printf("Amount: %.2f%n", amount);
        System.out.println("Payment done Successfully!");
    }
}
