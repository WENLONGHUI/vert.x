package effective.Item1.exercise1;

public class Rectangle implements Shape{

    private double width;
    private double height;

    @Override
    public double area() {
        return width * height;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

}
