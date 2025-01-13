package shapes;

import colors.Color;

public class Triangle extends shapes.Shape {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Point a, Point b, Point c) {
    }

    @Override
    public double getArea() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2.0);
    }

    @Override
    public double getPerimeter() {
        return distance(a, b) + distance(b, c) + distance(c, a);
    }

    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }


    public void draw() {
        super.draw();
        System.out.println("Triangle defined by points A: (" + a.getX() + ", " + a.getY() + "),B: (" + b.getX() + "," + b.getY() + ") C: (" + c.getX() + ", " + c.getY() + ")");
        System.out.println("Perimeter:"+getPerimeter()+",Area:"+getArea());
    }
}
