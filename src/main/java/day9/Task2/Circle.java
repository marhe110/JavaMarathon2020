package day9.Task2;

public class Circle extends Figure {
    private int radiusCircle;

    public Circle(int radiusCircle, String color) {
        this.radiusCircle = radiusCircle;
        this.setColor(color);
    }

    @Override
    public double area() {

        return Math.PI * radiusCircle * radiusCircle;
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radiusCircle;
    }
}
