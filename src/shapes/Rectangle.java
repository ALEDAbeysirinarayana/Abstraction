package shapes;

public class Rectangle extends shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double Area;
        Area = length * width;
        return Area;
    }

    public double calculatePerimeter() {
        double Perimeter;
        Perimeter = 2 * (length + width);
        return Perimeter;
    }
}
