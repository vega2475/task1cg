package edu.vegaldn;

import java.awt.*;
import java.awt.event.ActionEvent;

public class CarF1 extends WheelArc implements Drawable {
    private int x;
    private final int y;
    private int wheelAngle;


    public CarF1(int y) {
        super(0, 500, 5);
        this.x = 0;
        this.y = y;
        this.wheelAngle = 0;
    }

    @Override
    public void draw(Graphics g) {
        //заднее антикрыло
        int[] xPoints = {this.x - 30, this.x + 50, this.x + 150};
        int[] yPoints = {this.y - 100, this.y - 100, this.y + 50};
        g.setColor(new Color(0xBE0606));
        g.fillPolygon(xPoints, yPoints, 3);

        //кузов (а чо не багажник)
        g.setColor(new Color(0xF98E1D));
        g.fillRect(this.x + 100, this.y, 400, 75);

        //переднее антикрыло
        g.setColor(new Color(0xFFFFFF));
        int[] xPointsFrontWing = {this.x + 700, this.x + 500, this.x + 500};
        int[] yPointsFrontWing = {this.y + 75, this.y, this.y + 75};
        g.fillPolygon(xPointsFrontWing, yPointsFrontWing, 3);

        //воздухозаборник
        g.setColor(new Color(1));
        g.fillOval(this.x + 280, this.y - 40, 30, 30);

        g.setColor(new Color(1));
        int[] xPoints1 = {this.x + 160, this.x + 300, this.x + 300, this.x + 100};
        int[] yPoints1 = {this.y - 40, this.y - 40, this.y, this.y};
        g.fillPolygon(xPoints1, yPoints1, 4);

        //заднее колесо
        g.setColor(new Color(1));
        g.fillOval(this.x + 70, this.y - 20, 120, 120);


        //переднее колесо
        g.setColor(new Color(1));
        g.fillOval(this.x + 470, this.y, 100, 100);


        //арки
        paintComponent(g);

        //задний диск
        g.setColor(new Color(255, 255, 255));
        g.fillOval(this.x + 105, this.y + 15, 50, 50);

        //передний диск
        g.setColor(new Color(255, 255, 255));
        g.fillOval(this.x + 504, this.y + 32, 35, 35);
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        wheelAngle -= 1;
        repaint();
    }

    //вращение колес
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(0xBE0606));

        g.fillArc(this.x + 470, this.y, 100, 100, wheelAngle, 45); // Дуга на переднем колесе
        g.fillArc(this.x + 70, this.y - 20, 120, 120, wheelAngle, 45); // Дуга на заднем колесе
    }
}
