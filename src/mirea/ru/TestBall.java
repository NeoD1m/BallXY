package mirea.ru;

public class TestBall {
    public void main(String[] args){

        Ball blueBall = new Ball(0,0);
        System.out.println(blueBall.toString());
        blueBall.move(10,-2);
        System.out.println(blueBall.toString());
    }
}
