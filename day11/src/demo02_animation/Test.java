package demo02_animation;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("action");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        panel.setPreferredSize(new Dimension(1000,500));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        while(true){
            panel.repaint();
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
