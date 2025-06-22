package spring.com.spring;

import javax.swing.JPanel;

public class MainApplication {
    public static void main(String[] args) {
        ZoombieGame zoombieGame = new ZoombieGame();
        GameRunner gameRunner = new GameRunner(zoombieGame);
        gameRunner.moveUp();
        gameRunner.moveDown();

        JPanel jp = new JPanel();
    }
}
