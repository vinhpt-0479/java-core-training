package Practice1;

public class Shape {
    public double width;
    public double height;

    Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("SHAPE: width(%f) height(%f)", width, height);
    }
}
