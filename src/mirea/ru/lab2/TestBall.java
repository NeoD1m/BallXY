package mirea.ru.lab2;

public class TestBall {
    public static void main(String[] args){

        Ball blueBall = new Ball(0,0);
        System.out.println(blueBall.toString());
        blueBall.move(10,-2);
        System.out.println(blueBall.toString());
    }
}
