package Main;

public class Game {
    private GamePanel gamePanel;
    private GameWindow gameWindow;

    public Game() {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
    }

}
