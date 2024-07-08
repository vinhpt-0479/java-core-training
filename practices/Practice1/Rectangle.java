package Practice1;

public class Rectangle extends Shape {

    Rectangle(double width, double height) {
        super(width, height);
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("RECTANGLE: width(%f) height(%f) area(%f) perimeter(%f)", width, height, getArea(),
                getPerimeter());
    }
}
