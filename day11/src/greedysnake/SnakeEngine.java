package greedysnake;

import demo03_gameengine.GameEngine;

/**
 * GameEngine的子类，实现贪吃蛇的业务逻辑
 */
public class SnakeEngine extends GameEngine {
    @Override
    public void updateLogic() {
        System.out.println("逻辑");
    }

    @Override
    public void renderUI() {
        System.out.println("UI");
    }
}
