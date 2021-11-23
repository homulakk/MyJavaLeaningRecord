package snakegame;


public class StarteGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.init("贪吃蛇",Config.WINDOW_WIDTH,
                Config.WINDOW_HEIGHT,new SnakeGameEngine());

    }
}
