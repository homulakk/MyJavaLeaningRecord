package demo06_game_jar;

import com.itheima.game.Game;
import com.itheima.game.GameEngine;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MyGameEngine extends GameEngine {
    int x_board = 275;
    int y_board = 470;
    int x_oval = 20;
    int y_oval = 20;
    int x_speed = 1;
    int y_speed = 1;

    @Override
    //要实现球反弹的逻辑,要引入速度
    //球碰到上下边界后，y轴速度取反，碰到左右边界，x轴速度取反
    public void updateLogic() {
        x_oval += x_speed;
        y_oval += y_speed;
        //上界
        if (y_oval ==0){
            y_speed = -y_speed;
        }
        //左边界和右边界
        if (x_oval ==0 || x_oval == 570){
            x_speed = -x_speed;
        }
        //碰到板子
        if (y_oval == 450 && x_oval+10 >= x_board && x_oval+10 <= x_board+50){
            y_speed = -y_speed;
        }
        //下界
        if (y_oval ==470){
            Game.gameOver("菜鸡","结束了");
        }
        //先用getCurrentPressedKeyCode方法获得键盘输入存在int类型的小盒子里面
        //gcpkc方法返回值是int，可能是每个键位对应一个整数
        int keyCode = getCurrentPressedKeyCode();
        if (keyCode == KeyEvent.VK_LEFT){
            x_board -= 2;
        }
        if (keyCode == KeyEvent.VK_RIGHT){
            x_board += 2;
        }
    }

    @Override
    public void renderUI(Graphics2D g2d) {
        g2d.fillRect(x_board,y_board,50,10);

        g2d.fillOval(x_oval,y_oval,30,30);

    }
}
