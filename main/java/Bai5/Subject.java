package Bai5;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>(); // Danh sách các observer

    // Phương thức để thêm observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Phương thức để xóa observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Phương thức thông báo cho tất cả các observer khi có sự kiện
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
