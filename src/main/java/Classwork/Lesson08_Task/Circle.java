package Classwork.Lesson08_Task;

public class Circle extends Figures{
    Point center = new Point();
    int radius;
    @Override
    public int area() {

        return radius + (center.x * center.y);
    }
}
