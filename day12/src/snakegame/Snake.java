package snakegame;

import java.awt.*;
import java.util.LinkedList;

public class Snake {
    LinkedList<Node> snake = new LinkedList<Node>();

    //list方法要在方法体内才能调用
    public Snake() {
        snake.add(new Node(5, 5));
        snake.add(new Node(5, 6));
        snake.add(new Node(5, 7));
        snake.add(new Node(5, 8));
        snake.add(new Node(5, 9));
    }

    public void draw(Graphics2D graphics2D) {
        for (int i = 0; i < snake.size(); i++) {
           //蛇头
            if (i == 0) {
                graphics2D.setColor(Color.red);
            }else {     //蛇身
                graphics2D.setColor(Color.black);
            }
           //snake里的node取出来draw
            snake.get(i).draw(graphics2D);
        }
    }


}

