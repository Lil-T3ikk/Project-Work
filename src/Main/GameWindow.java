package Main;

import javax.swing.JFrame;

public class GameWindow () {

    private JFrame jFrame;

    public GameWindow() {
        jFrame = new JFrame();
        jFrame.setSize(800, 600);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        
    }

}