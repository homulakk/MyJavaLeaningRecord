package demo01_oop_design;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("面向对象作图");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        panel.setPreferredSize(new Dimension(400,400));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}
