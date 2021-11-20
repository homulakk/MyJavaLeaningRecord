package demo01_oop_design;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyLine line = new MyLine();

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        line.draw(g);
    }
}
