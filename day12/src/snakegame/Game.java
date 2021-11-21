package snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * 实现游戏初始化init()
 * 结束gameOver()
 * 和画板paint()方法调用renderUI
 * 三个函数
 */
public class Game extends JPanel{
   public static SnakeGameEngine engine;

    //显示窗口
    public void init(String title,int WINDOW_WIDTH,
                     int WINDOW_HEIGHT,SnakeGameEngine engine){
        this.engine = engine;
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //不能用JPnael new对象,要调用的是自己的paint()，否则repaint()没用了
        Game game = new Game();
        game.setPreferredSize(new Dimension(WINDOW_WIDTH,
                WINDOW_HEIGHT));

        frame.add(game);
        frame.pack();
        frame.setVisible(true);

        while(true){
            engine.updateLogic();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            game.repaint();
        }
    }

    public void gameOver(){

    }

    @Override
    //画板，要画的内容
    public void paint(Graphics graphics) {
        super.paint(graphics);
        engine.renderUI((Graphics2D) graphics);
    }
}
