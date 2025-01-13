package shapes;

import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public void move(double moveX, double moveY) {
        System.out.println("Moving shape by (" + moveX + ", " + moveY + ")");
    }

    public void draw() {
        System.out.println("Shape: " + this.getClass().getSimpleName() +
                ", Color: " + color);
    }
}

