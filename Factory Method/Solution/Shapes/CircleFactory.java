package Shapes;
public class CircleFactory implements ShapeFactory {

    public CircleFactory(){}

    public Circle getShape(int size) {
        return new Circle(size);
    }

    
}