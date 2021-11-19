package demo04_draw_x;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //new出骨架
        JFrame frame = new JFrame("我的大学");
        //完全关闭
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //new出panel
        MyPanel panel = new MyPanel();
        //设置panel窗口宽高
        panel.setPreferredSize(new Dimension(300,300));

        //镶嵌
        frame.add(panel);
        //通知框架根据panel调整自己的大小
        frame.pack();

        //挂出来
        frame.setVisible(true);
    }
}
