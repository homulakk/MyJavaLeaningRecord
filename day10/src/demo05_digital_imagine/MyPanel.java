package demo05_digital_imagine;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    //paint方法 用g作图
    //抗锯齿
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawLine(0,0,0,300);
    }
}
