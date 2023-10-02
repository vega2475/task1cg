package edu.vegaldn;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException, IOException {
        DrawPanel panel = new DrawPanel(35);
        this.add(panel);
    }
}
