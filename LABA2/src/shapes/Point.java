package shapes;

import colors.Color;

public class Point extends shapes.Shape {
    private double x;
    private double y;
    private Color color = Color.TRANSPARENT;

    // Конструктор без параметров
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        this.color = Color.TRANSPARENT;
    }

    // Конструктор с параметрами типа double
    public Point(double x, double y, Color color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    // Перегруженный конструктор с целыми числами
    public Point(int x, int y) {
        super(Color.TRANSPARENT); // По умолчанию цвет - прозрачный
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public void draw() {
        System.out.println("Shape: Point: (" + x + ", " + y + "), Color: " + getColor());

    }


    public void move(double moveX, double moveY) {
        this.x += moveX;
        this.y += moveY;
    }

    public double getArea() { return 0.0; }

    public double getPerimeter() { return 0.0; }
}