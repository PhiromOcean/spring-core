package spring.com.spring;

public class ZoombieGame implements Game{

    public void up() {
        System.out.println("forward");
    }

    public void down() {
        System.out.println("go back");
    }

    public void left() {
        System.out.println("go left");
    }

    public void right() {
        System.out.println("go right");
    } 
}
