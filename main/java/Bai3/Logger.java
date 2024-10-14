package Bai3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try (FileWriter fw = new FileWriter("log.txt", true);  // Ghi tiếp vào file
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(message);  // Ghi thông điệp log vào file
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi log: " + e.getMessage());
        }
        System.out.println("Log: " + message);  // Ghi log ra màn hình
    }
}
