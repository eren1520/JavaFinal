package Bai5;

public class SMSSubscriber implements Observer{
    private String phoneNumber;

    // Constructor
    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Phương thức update được gọi khi có thông báo
    @Override
    public void update(String message) {
        System.out.println("Thông báo qua SMS tới " + phoneNumber + ": " + message);
    }
}
