package spring.com.spring;

public class GameRunner {
    private Game game;
    
    
    public GameRunner(Game game) {
        this.game = game;
    }

    public void moveUp(){
        game.up();
    }

    public void moveDown(){
        game.down();
    }

    public void moveLeft(){
        game.left();
    }

    public void moveRight(){
        game.right();
    }
}
