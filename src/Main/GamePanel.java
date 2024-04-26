package Main;

import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

public class GamePanel extends JPanel{

    private MouseInputs mouseInputs;
    private int xDelta = 32, yDelta = 32;
    private double frames = 0;
    private long lastCheck = 0;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void followMouse(int x, int y) {
        
        if (x >= 512) {
            this.xDelta = 512;
        }else {
            this.xDelta = x;
        }
        if (y >= 512) {
            this.yDelta = 512;
        }else {
            this.yDelta = y;
        }
        repaint();
    }

    public void goUp(int value) {
        if (yDelta >= 32) {
            yDelta -= value;
            repaint();
        }
    }

    public void goDown(int value) {
        if (yDelta <= 448) {
            yDelta += value;
            repaint();
        }
    }

    public void goRight(int value) {
        if (xDelta <= 480) {
            xDelta += value;
            repaint();
        }
    }

    public void goLeft(int value) {
        if (xDelta >= 32) {
            xDelta -= value;
            repaint();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(0 + xDelta, 0 + yDelta, 128, 128);

        frames++;
        if (System.currentTimeMillis() - lastCheck >= 1000) {
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames = 0;
        }
    }
}
