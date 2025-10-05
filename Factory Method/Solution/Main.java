import java.util.List;

import Shapes.*;

public class Main {
    List<String> list;
    public static void main(String[] args) {
        int circleSize = 3;
        int squareSize = 4;
        
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory circleFactory = new CircleFactory();
    
        // Shape circle = new Circle(circleSize); // Cannot create an instance of them
        Shape circle = circleFactory.getShape(circleSize);
        Shape square = squareFactory.getShape(squareSize);

        circle.draw();
        square.draw();
    }
}
