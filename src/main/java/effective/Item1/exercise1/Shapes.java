package effective.Item1.exercise1;

public class Shapes{

    public static Shape createCircle(double radius) {
        return new Circle(radius);
    }

    public static Shape createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }
}
