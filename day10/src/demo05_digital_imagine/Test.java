package demo05_digital_imagine;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("艺术好吧");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        panel.setPreferredSize(new Dimension(300,300));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
