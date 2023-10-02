package edu.vegaldn;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainWindow window = new MainWindow();
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setTitle("Car on the Landscape");
        window.setSize(2000, 1000);
        window.setVisible(true);
    }
}
