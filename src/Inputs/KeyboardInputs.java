package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Main.GamePanel;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;

    

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A:
                gamePanel.goLeft(32);
                break;
            case KeyEvent.VK_D:
                gamePanel.goRight(32);
                break;
            case KeyEvent.VK_W:
                gamePanel.goUp(32);
                break;
            case KeyEvent.VK_S:
                gamePanel.goDown(32);
                break;
            default:
                System.out.println("NIGGA");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("ho lasciato un tasto woooooooow");
    }

    
}