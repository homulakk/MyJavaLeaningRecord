package demo02_animation;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Action action = new Action();


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        action.draw(g);
    }
}
