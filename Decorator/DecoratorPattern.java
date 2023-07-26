package Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();

        Shape redShapeDecorator = new RedShapeDecorator(rectangle);
        redShapeDecorator.draw();

        Shape circleRedShapeDecorator = new RedShapeDecorator(circle);
        circleRedShapeDecorator.draw();
    }
}
