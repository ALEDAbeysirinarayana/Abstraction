package shapes;

public class Circle extends shape {
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        double Area;
        Area = 3.14 * radius * radius;
        return Area;
    }
    public double calculatePerimeter(){
        double Perimeter;
        Perimeter = 2 * 3.14 * radius;
        return Perimeter;
    }

}
