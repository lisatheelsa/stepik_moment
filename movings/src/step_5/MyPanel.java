package step_5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel{
    private BufferedImage image;
    private int x = 20;
    private int y = 20;

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
            if (x < 500 && y == 20) {
                x += 20;
            } else if(x == 500 && y < 500){
                y += 20;
            }else if(y==500 && x > 20){
                x -= 20;
            }else if(y >20 && x == 20){
                y -= 20;
            }
            repaint();
        }
    };
}
