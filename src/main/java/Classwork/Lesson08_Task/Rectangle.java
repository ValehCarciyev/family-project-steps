package Classwork.Lesson08_Task;

public class Rectangle extends Figures {
    Point p1 = new Point();
    Point p2 = new Point();

    @Override
    public int area() {
        return (p1.x + p1.y) * (p2.x + p2.y);
    }
}
