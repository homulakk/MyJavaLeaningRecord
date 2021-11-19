package demo07_draw_imagine;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImaginePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Image img = null;
        try {
            img = ImageIO.read(getClass().getClassLoader().getResourceAsStream("0.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        g.drawImage(img,0,0,null);
    }
}
