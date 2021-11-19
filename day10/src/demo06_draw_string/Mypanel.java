package demo06_draw_string;

import javax.swing.*;
import java.awt.*;

public class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g) {

        g.setColor(Color.CYAN);
        g.drawString("wodema",100,100);
    }
}
