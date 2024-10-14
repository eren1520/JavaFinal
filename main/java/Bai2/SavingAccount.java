package Bai2;

public class SavingAccount extends BankAccount{
    private double interestRate;

    // Constructor
    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Phương thức tính lãi suất và cập nhật số dư
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Lãi suất đã được áp dụng cho " + getAccountHolder() + ", số dư hiện tại: " + balance);
    }

}
