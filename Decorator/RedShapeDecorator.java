package Decorator;

public class RedShapeDecorator extends ShapeDecorator {

    RedShapeDecorator(Shape decorShape) {
        super(decorShape);
    }
    
    public void draw(){
        decoratShape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("red color");
    }
}
