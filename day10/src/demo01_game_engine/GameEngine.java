package demo01_game_engine;

import java.util.Scanner;

/**
 * 游戏引擎
 */
public abstract class GameEngine {

    //更新逻辑
    public abstract void updateLogic();

    //界面设计
    public abstract void renderUI();

    public String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
