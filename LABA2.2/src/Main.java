

import colors.Color;
import service.ShapesService;
import service.impl.ShapeServiceImpl;
import shapes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем список фигур
        List<Shape> shapes = new ArrayList<>();

        // Добавляем фигуры в список
        shapes.add(new Triangle(
                new Point(0, 0),
                new Point(0, 4),
                new Point(4, 0),
                Color.RED
        ));

        shapes.add(new Circle(
                new Point(3, 3),
                2,
                Color.WHITE
        ));

        shapes.add(new Circle(
                new Point(2, 5),
                4,
                Color.YELLOW
        ));

        shapes.add(new Rectangle(
                new Point(1, 1),
                new Point(5, 2),
                Color.TRANSPARENT
        ));

        shapes.add(new Point(100, 100, Color.TRANSPARENT));

        shapes.add(new Triangle(
                new Point(-2, 3),
                new Point(4, 3),
                new Point(2, 5),
                Color.BLUE
        ));

        // Создаем объект сервиса
        ShapesService shapesService = new ShapeServiceImpl();

        // Вызываем методы сервиса и выводим результаты
        System.out.println("Total Area of Shapes: " + shapesService.getSquares(shapes)); //Метод getSquares(shapes) подсчитывает общую площадь всех фигур.
        System.out.println("Maximum Perimeter of Shapes: " + shapesService.getMaxPerimeters(shapes)); //Метод getMaxPerimeters(shapes) находит максимальный периметр среди фигур.
        System.out.println("Colors of Shapes: " + shapesService.getColors(shapes)); //Метод getColors(shapes) возвращает уникальные цвета всех фигур в виде набора Set<Color>.

        // Рисуем фигуры
        System.out.println("\nDrawing all shapes:");
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(); // Для разделения фигур в выводе
        }
    }
}
