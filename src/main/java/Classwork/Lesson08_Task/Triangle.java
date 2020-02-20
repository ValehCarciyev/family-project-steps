package Classwork.Lesson08_Task;

public class Triangle extends Figures {
    Point p1 = new Point();
    Point p2 = new Point();
    Point p3 = new Point();

    @Override
    public int area() {
        return (p1.x + p2.x) * (p2.x + p2.y) * (p3.x + p3.y);
    }
}
