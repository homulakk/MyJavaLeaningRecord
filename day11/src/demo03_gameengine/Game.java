package demo03_gameengine;

import javax.swing.*;
import java.awt.*;

/**
 * 画板，继承JPanel父类，提供init初始化方法，内置了框架
 * 以及gameOver方法结束游戏
 * 和paint方法用来renderUI
 */
public class Game extends JPanel {
        public static GameEngine engine;

    /**
     * init方法，将窗口显示
     * @param title  窗口标题
     * @param width  窗口宽度
     * @param height 窗口高度
     * @param engine 实现了updateLogic和renderUI的GameEngine类对象，
     */
    public void init(String title, int width, int height, GameEngine engine) {
        this.engine =engine;
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel game = new JPanel();
        game.setPreferredSize(new Dimension(width, height));

        frame.add(game);
        frame.pack();
        frame.setVisible(true);

        while (true) {
            engine.updateLogic();
            game.repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        engine.renderUI();
    }
}
