package edu.vegaldn;

import java.awt.*;

public class Landscape implements Drawable{
    private final int width;
    private final int height;

    public Landscape(){
        this.width = 2000;
        this.height = 1000;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(0x87CEEB));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(new Color(0x444447));
        g.fillRect(0, (int) (getHeight() * 0.55), getWidth(), getHeight());

        for (int i= 0;i < getWidth();i +=150){
        g.setColor(new Color(0xFFFFFF));
        g.fillRect(i, 700, 100, 50);
        }
    }

    public int getWidth(){
        return this.width;
    }

    private int getHeight(){
        return this.height;
    }
}
