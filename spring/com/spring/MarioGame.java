package spring.com.spring;

public class MarioGame implements Game{
     public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("sit down");
    }

    public void left() {
        System.out.println("turn left");
    }

    public void right() {
        System.out.println("turn right");
    }
}
