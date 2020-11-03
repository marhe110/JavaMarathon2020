package day9.Task2;

import javax.xml.crypto.Data;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Rectangle extends Figure {
    private int width;
    private int height;


    public Rectangle(int width, int height, String color) {
        //super(color);
        this.width = width;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

}
