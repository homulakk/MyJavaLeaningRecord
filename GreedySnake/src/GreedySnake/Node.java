package snakegame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Node {
    int x ;
    int y ;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //静态属性，处在哪一个，本质上还是画矩形
    public void draw(Graphics2D graphics2D){
        //(3,1),填充矩形要用到fillRect()
        try {
            graphics2D.drawImage(ImageIO.read(getClass().getClassLoader().getResourceAsStream("body.png")),
                    Config.GRID_SIZE *x,Config.GRID_SIZE*y,
                    Config.GRID_SIZE,Config.GRID_SIZE,null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
