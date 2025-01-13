package shapes;

import colors.Color;

public class Rectangle extends shapes.Shape {
    private Point a;
    private Point c;

    public Rectangle(Point a, Point c, Color color) {
        super(color);
        this.a = a;
        this.c = c;
        validate();
    }

    public Rectangle(Point a, Point c) {
    }

    private void validate() {
        if (a.getX() == c.getX() || a.getY() == c.getY()) {
            System.out.println("Points cannot lie on the same line.");
        }
    }


    public double getArea() {
        return Math.abs((c.getX() - a.getX()) * (c.getY() - a.getY()));
    }


    public double getPerimeter() {
        return 2 * (Math.abs(c.getX() - a.getX()) + Math.abs(c.getY() - a.getY()));
    }


    public void draw() {
        super.draw();
        System.out.println("Rectangle defined by points A: (" + a.getX() + ", " + a.getY() + "), C: (" + c.getX() + ", " + c.getY() + ")");
        System.out.println("Perimeter:"+getPerimeter()+",Area:"+getArea());
    }
}