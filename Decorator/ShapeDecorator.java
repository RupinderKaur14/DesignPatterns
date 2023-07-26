package Decorator;

public abstract class ShapeDecorator implements Shape {
    protected  Shape decoratShape;

    ShapeDecorator(Shape decorShape){
        this.decoratShape = decorShape;
    }

    public void draw(){
        decoratShape.draw();
    }
}
