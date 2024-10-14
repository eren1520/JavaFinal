package Bai6;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter {
    private static final String API_URL = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/usd.json";
    public static void inTyGia(){
        try {
            // Tạo URL object
            URL url = new URL(API_URL);
            // Mở kết nối đến API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Kiểm tra mã phản hồi từ server (200 = OK)
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Đọc dữ liệu từ API
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Chuyển dữ liệu JSON từ API thành đối tượng JSONObject
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Lấy tỷ giá USD sang VND từ JSON
                double usdToVnd = jsonResponse.getJSONObject("usd").getDouble("vnd");

                // In ra tỷ giá
                System.out.println("Tỷ giá quy đổi từ USD sang VND: " + usdToVnd);
            } else {
                System.out.println("Yêu cầu thất bại! Mã phản hồi: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
