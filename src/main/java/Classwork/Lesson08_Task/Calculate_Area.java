package Classwork.Lesson08_Task;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Calculate_Area {
    public static void main(String[] args) {
        ArrayList<Figures> area = new ArrayList<>();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            Random sizes = new Random();
            int ch = r.nextInt(3) + 1;
            if(ch == 1){
                circle.center.x = sizes.nextInt(10);
                circle.center.y = sizes.nextInt(10);
                circle.radius = sizes.nextInt(10);
                area.add(circle);
                int circle_area = circle.area();
                System.out.println("Circle's area is: " + circle_area);
            }
            else if(ch == 2){
                rectangle.p1.x = sizes.nextInt(10);
                rectangle.p1.y = sizes.nextInt(10);
                rectangle.p2.x = sizes.nextInt(10);
                rectangle.p2.y = sizes.nextInt(10);
                area.add(rectangle);
                int rec_area = rectangle.area();
                System.out.println("Rectangle's area is: " + rec_area);
            }
            else if(ch == 3){
                triangle.p1.x = sizes.nextInt(10);
                triangle.p1.y = sizes.nextInt(10);
                triangle.p2.x = sizes.nextInt(10);
                triangle.p2.y = sizes.nextInt(10);
                triangle.p3.x = sizes.nextInt(10);
                triangle.p3.y = sizes.nextInt(10);
                area.add(triangle);
                int tri_area = triangle.area();
                System.out.println("Triangle's area is: " + tri_area);
            }
        }
        int total_area = 0;
        for (Figures f: area) {
            total_area += f.area();
        }
        System.out.println("Total area is: " + total_area);
    }
}
