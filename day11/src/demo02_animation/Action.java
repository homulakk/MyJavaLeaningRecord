package demo02_animation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Action {
    String[] pictureName = {"00.png","02.png",
            "03.png","04.png"};
    int i;

    public void draw(Graphics g){
        if (i==4){
            return;
        }
        try {
            g.drawImage(ImageIO.read(getClass().getClassLoader().
                    getResourceAsStream(pictureName[i])),
                    0,0,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        i++;
    }
}
