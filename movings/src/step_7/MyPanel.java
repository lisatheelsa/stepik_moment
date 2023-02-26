package step_7;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyPanel extends JPanel {

    private int x = (int) (120 * Math.cos(Math.toRadians(0)));
    private int y = (int) (120 * Math.sin(Math.toRadians(0)));

    private BufferedImage imageSun;
    private BufferedImage imageP1;
    private int count = 1;


    MyPanel() {

        this.setPreferredSize(new Dimension(700, 700));

        try {
            imageSun = ImageIO.read(new File("sun.png"));
            imageP1 = ImageIO.read(new File("planet1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(5, messageAL);
        timer.start();

    }

    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, 700, 700);
        g2.drawImage(imageSun, 320, 320, this);
        g2.drawImage(imageP1, 310 + x, 310 + y, this);

    }

    ActionListener messageAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        x = (int) (120 * Math.cos(Math.toRadians(count)));
        y = (int) (120 * Math.sin(Math.toRadians(count)));
        count += 1.3;
        repaint();

        }
    };
}
