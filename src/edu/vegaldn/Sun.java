package edu.vegaldn;

import javax.swing.*;
import java.awt.*;

public class Sun extends JPanel implements Drawable {

    private int x;

    public Sun(int x){
        this.x = x;
    }

    public void setX(int x){
        this.x = x;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(new Color(0xF3D306));
        int sunSize = 100;
        g.fillOval(this.x, 50, sunSize, sunSize);
    }
}
