package demo06_draw_string;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("字符串");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Mypanel panel = new Mypanel();
        panel.setPreferredSize(new Dimension(400,400));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
