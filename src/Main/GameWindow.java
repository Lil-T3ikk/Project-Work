package Main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jFrame;

    public GameWindow(GamePanel gamePanel) {
        jFrame = new JFrame();

        jFrame.setSize(640, 640);
        jFrame.setResizable(false);
        jFrame.setTitle("2D Game");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);
    }
}
