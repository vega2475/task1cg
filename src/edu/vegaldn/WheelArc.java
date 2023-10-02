package edu.vegaldn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WheelArc extends JComponent implements ActionListener {
    private int x;
    private final int y;

    public WheelArc(int x, int y, int delay) {
        // Угол дуги колеса
        Timer timer = new Timer(delay, this);
        timer.start();
        this.x = x;
        this.y = y;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void setX(int x){
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }
}

