package Bai3;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Đây là thông điệp log thứ nhất.");
        logger2.log("Đây là thông linh tinh");

        if (logger1 == logger2) {
            System.out.println("Logger chỉ tồn tại một instance duy nhất.");
        } else {
            System.out.println("Có nhiều hơn một instance của Logger.");
        }

    }
}
