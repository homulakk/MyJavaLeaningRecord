package demo01_oop_design;

import java.awt.*;
import java.util.Random;

public class MyLine {
    Random random = new Random();
    int x1;
    int y1;
    int x2;
    int y2;

    public MyLine() {
        x1 = random.nextInt(300);
        y1 = random.nextInt(300);
        x2 = random.nextInt(300);
        y2 = random.nextInt(300);
    }

    public MyLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255)));
        g.drawLine(x1, y1, x2, y2);
    }

}
