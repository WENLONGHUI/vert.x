package effective.Item1.exercise1;

public class Circle implements Shape{
    private double radius;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }
}
