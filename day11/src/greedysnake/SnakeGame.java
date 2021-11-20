package greedysnake;

import com.itheima.game.Game;

public class SnakeGame {
    public static void main(String[] args) {

        Game.init("贪吃蛇",500,500,new SnakeEngine());
    }
}
