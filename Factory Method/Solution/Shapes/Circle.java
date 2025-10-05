package Shapes;
public class Circle implements Shape{
    int size;

    protected Circle(int size){this.size = size;}

    public void draw() {
        System.out.println("Circle, size: " + size);
    };


}