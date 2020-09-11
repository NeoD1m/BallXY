package mirea.ru.lab3;

public class Circle extends Shape{
    protected double radius;
    public Circle(double radius,String color, Boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public Circle(){

    }
    public Circle(double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
