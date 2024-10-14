package Bai5;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Subject (có thể coi như một hệ thống thông báo)
        Subject notificationSystem = new Subject();

        // Tạo các subscriber (Email và SMS)
        EmailSubscriber emailSubscriber1 = new EmailSubscriber("user1@example.com");
        EmailSubscriber emailSubscriber2 = new EmailSubscriber("user2@example.com");
        SMSSubscriber smsSubscriber1 = new SMSSubscriber("0123456789");
        SMSSubscriber smsSubscriber2 = new SMSSubscriber("0987654321");

        // Đăng ký các subscriber vào hệ thống thông báo
        notificationSystem.addObserver(emailSubscriber1);
        notificationSystem.addObserver(emailSubscriber2);
        notificationSystem.addObserver(smsSubscriber1);
        notificationSystem.addObserver(smsSubscriber2);

        // Xảy ra một sự kiện, thông báo cho tất cả các subscriber
        notificationSystem.notifyObservers("Sự kiện mới: Khuyến mãi 50% cho tất cả sản phẩm!");

        // Xóa một subscriber và thông báo lại
        notificationSystem.removeObserver(emailSubscriber2);
        notificationSystem.notifyObservers("Sự kiện mới: Miễn phí vận chuyển toàn quốc!");
    }
}
