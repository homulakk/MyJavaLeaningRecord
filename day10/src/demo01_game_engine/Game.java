package demo01_game_engine;

public class Game {
    public static void main(String[] args) {
    init();

    }

    //打开窗口，循环轮流执行updateLogic和renderUI方法
    public static void init(){
        MyGameEngine gameEngine = new MyGameEngine();
        while(true){
            gameEngine.updateLogic();
            gameEngine.renderUI();
        }
    }
}
