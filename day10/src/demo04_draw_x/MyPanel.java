package demo04_draw_x;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {

        g.drawLine(0,0,300,300);
        g.drawLine(300,0,0,300);

    }
}
