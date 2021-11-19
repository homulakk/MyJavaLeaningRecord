package demo02_dialog;

import javax.swing.*;

public class Test02 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("请输入姓名");
        JOptionPane.showMessageDialog(null,"欢迎，"+name);
    }
}
