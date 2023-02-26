package step_4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    private BufferedImage image;
    private int x = 0;
    private int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(700, 700));

        try {
            image = ImageIO.read(new File("belkaa.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(20,messageAL);
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, 700, 700);
        g2.drawImage(image, x, y, this);
    }

    ActionListener messageAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            x += 3;
            y += 3;
            if (x > 700 && y > 700) {
                x = 0;
                y = 0;
            }
            repaint();
        }
    };

}
