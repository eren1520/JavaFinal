package Bai2;

import Bai1.Student;

public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản thường
        BankAccount account1 = new BankAccount("123456", "Tran Huy", 1000);
        // Tạo tài khoản tiết kiệm
        SavingAccount account2 = new SavingAccount("789012", "Tran ku", 5000, 0.05);

        // Thực hiện các thao tác trên tài khoản thường
        account1.deposit(500);
        account1.withdraw(300);
        account1.checkBalance();

        // Thực hiện các thao tác trên tài khoản tiết kiệm
        account2.deposit(1000);
        account2.withdraw(2000);
        account2.applyInterest();
        account2.checkBalance();




    }
}
