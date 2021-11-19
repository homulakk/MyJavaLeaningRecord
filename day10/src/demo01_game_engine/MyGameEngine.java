package demo01_game_engine;

public class MyGameEngine extends GameEngine {

    @Override
    public void updateLogic() {
        System.out.println("更新逻辑");
    }

    @Override
    public void renderUI() {
        System.out.println("更新UI");
    }
}
