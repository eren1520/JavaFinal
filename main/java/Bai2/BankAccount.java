package Bai2;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;


    public BankAccount(){}

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " đã nạp " + amount + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " đã rút " + amount + " từ tài khoản.");
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
        }
    }
    public void checkBalance() {
        System.out.println("Số dư của " + accountHolder + ": " + balance);
    }


}
