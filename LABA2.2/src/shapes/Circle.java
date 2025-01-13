package shapes;

import colors.Color;

public class Circle extends shapes.Shape {
    private Point point;
    private double radius;

    public Circle() {}

    public Circle(Point point, double radius, Color color) {
        super(color);
        this.point = point;
        this.radius = radius;
        validate();
    }

    public Circle(Point point, int i) {
    }

    private void validate() {
        if (radius <= 0) {
            System.out.println("Radius cannot be less than or equal to zero");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        validate();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void draw() {
        System.out.println("Shape: Circle, Color: " + getColor() +
                ", Center: (" + point.getX() + ", " + point.getY() + "), Radius: " + radius);
        System.out.println("Perimeter:"+getPerimeter()+",Area:"+getArea());
    }
}