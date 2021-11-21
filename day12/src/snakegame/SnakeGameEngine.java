package snakegame;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SnakeGameEngine extends GameEngine {
    Grid grid = new Grid();
    Snake snake = new Snake();


    @Override
    public void updateLogic() {
       //把键盘事件对应的值传过来
       //键盘事件的逻辑在GameEngine中实现
        int keyCode = getKeyCode();
        if (keyCode == KeyEvent.VK_RIGHT){
            System.out.println("向右");
        }
    }



    @Override
    public void renderUI(Graphics2D graphics2D) {
//        System.out.println("renderUI");
        if (Config.GRID_SWITCH) {
            grid.draw(graphics2D);
        }
        snake.draw(graphics2D);

    }
}

