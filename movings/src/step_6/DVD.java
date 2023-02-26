package step_6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class DVD extends JPanel{


    BufferedImage image;
    private int x = 800;
    private int y = 300;
    private boolean isToRightUp = true;
    private boolean isToLeftUp = false;
    private boolean isToRightDown = false;
    private boolean isToLeftDown = false;

    DVD() {

        this.setPreferredSize(new Dimension(1200, 600));

        try {
            image = ImageIO.read(new URL("http://2.bp.blogspot.com/-ZMXk2o0a5Qc/Ttd0-XLWYlI/AAAAAAAAEas/HZ_pd21X8C0/s200/logo_dvd.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Timer timer = new Timer(5, messageAL);
        timer.start();

    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setBackground(Color.black);
        g2D.clearRect(0, 0, 1200, 600);
        g2D.drawImage(image, x, y, this);
    }

    ActionListener messageAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        if ((x == 996 && y == 104) || (x == 394 && y == 506)) {
            changeLogo();
            isToRightUp = false;
            isToRightDown = false;
            isToLeftUp = true;
            isToLeftDown = false;
        } else if (x == 896 && y == 4) {
            changeLogo();
            isToRightUp = false;
            isToRightDown = false;
            isToLeftUp = false;
            isToLeftDown = true;
        } else if ((x == 510 && y == 2) || (x == 114 && y == 2)) {
                changeLogo();
                isToRightUp = false;
                isToRightDown = true;
                isToLeftUp = false;
                isToLeftDown = false;
            } else if ((x == 2 && y == 114) || (x == 604 && y == 492)) {
                changeLogo();
                isToRightUp = true;
                isToRightDown = false;
                isToLeftUp = false;
                isToLeftDown = false;
            } else if (x == 1000 && y == 96) {
                changeLogo();
                isToRightUp = true;
                isToRightDown = false;
                isToLeftUp = false;
                isToLeftDown = false;
                x = 800;
                y = 300;
            }

        if (isToRightUp) {
            x = x + 2;
            y = y - 2;
        } else if (isToLeftUp) {
            x = x - 2;
            y = y - 2;
        } else if (isToLeftDown) {
            x = x - 2;
            y = y + 2;
        } else if (isToRightDown) {
            x = x + 2;
            y = y + 2;
        }

        repaint();

    }

    public void changeLogo() {

        int n = (int) Math.round(Math.random() * 4);
        System.out.println(n);
        if (n == 1) {
            try {
                image = ImageIO.read(new File("dvd1.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (n == 2) {
            try {
                image = ImageIO.read(new File("dvd2.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                image = ImageIO.read(new File("dvd3.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
};
}
