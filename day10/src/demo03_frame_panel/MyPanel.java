package demo03_frame_panel;

import javax.swing.*;
import java.awt.*;

/**
 * 自建画板
 * 继承swing里的画板JPanel
 */
public class MyPanel extends JPanel {

    //作画

    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,400,400);
    }
}
