package Practice1;

public class Circle extends Shape {

    Circle(double radius) {
        super(radius, radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(width, 2);
    }

    public double getCircumference() {
        return 2 * width * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("CIRCLE: radius(%f) area(%f) circumference(%f)", width, getArea(),
                getCircumference());
    }
}
