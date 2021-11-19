package demo03_frame_panel;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //new出JFrame 框架
        JFrame frame = new JFrame("holy shit");    //ctrl+p
        //点叉叉完全退出
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //new出MyPanel，镶嵌到框架上
        MyPanel panel = new MyPanel();
        //设置窗口大小 300*300
        panel.setPreferredSize(new Dimension(300,300));
        frame.add(panel);

        //可视
        frame.setVisible(true);
    }
}

