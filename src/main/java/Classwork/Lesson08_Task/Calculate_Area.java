package Classwork.Lesson08_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculate_Area {
    public static void main(String[] args) {
        ArrayList<Figures> area = new ArrayList<>();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

            circle.center.x = 5;
            circle.center.y = 7;
            circle.radius = 6;
            area.add(circle);
            int circle_area = circle.area();
        System.out.println("Circle's area is: " + circle_area);

            rectangle.p1.x = 2;
            rectangle.p1.y = 5;
            rectangle.p2.x = 3;
            rectangle.p2.y = 5;
            area.add(rectangle);
            int rec_area = rectangle.area();
        System.out.println("Rectangle's area is: " + rec_area);

            triangle.p1.x = 8;
            triangle.p1.y = 6;
            triangle.p2.x = 7;
            triangle.p2.y = 6;
            triangle.p3.x = 7;
            triangle.p3.y = 5;
            area.add(triangle);
            int tri_area = triangle.area();
        System.out.println("Triangle's area is: " + tri_area);

            int total_area = area.get(0).area() + area.get(1).area() + area.get(2).area();

        System.out.println("Total area is: " + total_area);

    }
}
