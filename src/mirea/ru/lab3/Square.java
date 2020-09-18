package mirea.ru.lab3;

public class Square extends Rectangle {
    private double side;
    public Square(double side,String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(){

    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return null;
    }
}
