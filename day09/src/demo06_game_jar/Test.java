package demo06_game_jar;

import com.itheima.game.Game;

public class Test {
    public static void main(String[] args) {
        Game.init("ping-pong",600,500,new MyGameEngine());

    }
}
