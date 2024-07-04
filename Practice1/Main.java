package Practice1;

class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(2, 3);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5.5);
        System.out.println(shape.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
    }
}