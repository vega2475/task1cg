package edu.vegaldn;

import javax.swing.*;
import java.awt.*;

public class Car extends JFrame implements Drawable {
    private int x;
    private int y;

    public Car(int y) {
        this.x = 0;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0xFF4F00));
        g.fillRect(this.x, this.y, 400, 300); // грузовой отсек

        g.setColor(new Color(0x9FA29A));
        g.fillRect(this.x, this.y + 230, 400, 80); // полоса внизу грузового отсека

        g.setColor(new Color(0x085EA5));
        g.fillRect(this.x + 400, this.y, 250, 310);

        //колеса
        g.setColor(new Color(0));
        g.fillOval(this.x + 90, this.y + 270, 100, 100);

        g.setColor(new Color(0));
        g.fillOval(this.x + 460, this.y + 270, 100, 100);
    }
}
