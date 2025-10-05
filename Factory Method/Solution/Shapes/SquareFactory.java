package Shapes;
public class SquareFactory implements ShapeFactory {

    public SquareFactory(){}

    public Square getShape(int size) {
        return new Square(size);
    }

    
}