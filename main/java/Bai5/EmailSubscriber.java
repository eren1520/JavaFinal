package Bai5;

public class EmailSubscriber implements Observer{
    private String email;

    // Constructor
    public EmailSubscriber(String email) {
        this.email = email;
    }
    @Override
    public void update(String message) {
        System.out.println("Thông báo qua Email tới " + email + ": " + message);
    }

}
