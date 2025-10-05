package Shapes;
public class Square implements Shape{
    int size;

    protected Square(int size){this.size = size;}

    public void draw() {
        System.out.println("Square, size: " + size);
    }
}