package step9;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Car extends JLabel {

    private BufferedImage image;
    private int x;
    private int y;
    private boolean isWinner = false;

    Car(String path, int x, int y) {

        this.x = x;
        this.y = y;

        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setBounds(x, y, image.getHeight(), image.getWidth());

    }

    public boolean isWinner() {
        return this.isWinner;
    }

    public void setWinner(boolean winner) {
        this.isWinner = winner;
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, this.getX(), this.getY(), null);

    }

    public void moveCar() {

        int r = (int) Math.round(Math.random() * 7);
        this.setLocation(this.getX() + r, this.getY());

    }

}
