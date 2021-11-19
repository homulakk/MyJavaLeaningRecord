package demo07_draw_imagine;

import javax.swing.*;
import  java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imagine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImaginePanel panel = new ImaginePanel();
        panel.setPreferredSize(new Dimension(1920,1080));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}
