package edu.vegaldn;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class DrawPanel extends JPanel implements ActionListener {

    private final Timer timer;
    private int ticksFromStart = 1;
    private final Sun sun;
    private final Landscape landscape;
    private final CarF1 carF1;
    private final Image scaledImage; // Уменьшенное изображение


    public DrawPanel(final int timerDelay) throws IOException {
        timer = new Timer(timerDelay, this);
        timer.start();
        this.landscape = new Landscape();
        this.carF1 = new CarF1(500);
        this.sun = new Sun(850);
        try {
            // Исходное изображение
            Image originalImage = ImageIO.read(new File("/home/vega/IdeaProjects/task_01/src/edu/vegaldn/McLaren_Racing_logo.svg.png"));

            int newWidth = originalImage.getWidth(null) / 10;
            int newHeight = originalImage.getHeight(null) / 10;
            scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        } catch (IOException e) {
            throw new IOException(e);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int y = 500;
        landscape.draw(g);
        sun.draw(g);
        carF1.setX(ticksFromStart);
        carF1.draw(g);
        g.drawImage(scaledImage, ticksFromStart + 230, y, null);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart += 20;
        }
        if(ticksFromStart >= 2000){
            ticksFromStart = 1;
        }
    }
}
