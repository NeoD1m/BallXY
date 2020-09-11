package mirea.ru.lab3;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle(double width,double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (length*2)+(width*2);
    }

    @Override
    public String toString() {
        return null;
    }
}
