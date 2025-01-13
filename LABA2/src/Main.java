import shapes.Circle;
import shapes.Point;
import shapes.Rectangle;
import shapes.Triangle;
import colors.Color;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0, Color.RED);
        point.draw();

        Circle circle = new Circle(new Point(0, 0), 5, Color.BLUE);
        circle.draw();

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(4, 3), Color.GREEN);
        rectangle.draw();

        Triangle triangle = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4), Color.YELLOW);
        triangle.draw();
    }
}
