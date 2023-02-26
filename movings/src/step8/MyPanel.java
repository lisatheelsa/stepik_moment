package step8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {

    private int x = (int) (120 * Math.cos(Math.toRadians(0)));
    private int y = (int) (120 * Math.sin(Math.toRadians(0)));
    private int x1 = (int) (300 * Math.cos(Math.toRadians(0)));
    private int y1 = (int) (300 * Math.sin(Math.toRadians(0)));
    private int x2 = (int) (200 * Math.cos(Math.toRadians(0)));
    private int y2 = (int) (200 * Math.sin(Math.toRadians(0)));

    private BufferedImage imageSun;
    private BufferedImage imageP1;
    private BufferedImage imageP2;
    private BufferedImage imageP3;

    private int count = 1;
    private double count1 = 0.5;
    private double count2 = 0.7;

    MyPanel() {

        this.setPreferredSize(new Dimension(700, 700));

        try {
            imageSun = ImageIO.read(new File("sun.png"));
            imageP1 = ImageIO.read(new File("planet1.png"));
            imageP2 = ImageIO.read(new File("planet2.png"));
            imageP3 = ImageIO.read(new File("planet4.png"));
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
        g2.drawImage(imageP2, 310 + this.x1, 310 + this.y1, this);
        g2.drawImage(imageP3, 310 + this.x2, 310 + this.y2, this);

    }

    ActionListener messageAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x = (int) (120 * Math.cos(Math.toRadians(count)));
            y = (int) (120 * Math.sin(Math.toRadians(count)));
            x1 = (int) (300 * Math.cos(Math.toRadians(count1)));
            y1 = (int) (300 * Math.sin(Math.toRadians(count1)));
            x2 = (int) (200 * Math.cos(Math.toRadians(count2)));
            y2 = (int) (200 * Math.sin(Math.toRadians(count2)));
            count += 1.3;
            count1 += 0.3;
            count2 += 0.5;
            repaint();

        }
    };
}

