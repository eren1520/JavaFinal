package Bai4;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng của ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Lấy đối tượng Shape Circle và gọi phương thức draw
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Lấy đối tượng Shape Square và gọi phương thức draw
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();


        // Lấy đối tượng Shape Rectangle và gọi phương thức draw
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

    }
}
