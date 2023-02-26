package step9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private String status = "";
    private int stringX = 325;
    private int stringY = 100;

    private Timer start;
    private Timer game;

    private static int x = 0;

    private Car blueCar;
    private Car greenCar;
    private Car pinkCar;
    private Car redCar;
    private Car yellowCar;

    Panel() {

        this.setLayout(null);
        this.setPreferredSize(new Dimension(800, 800));

        blueCar = new Car("BlueCar.png", 0, 250);
        greenCar = new Car("GreenCar.png", 0, 350);
        pinkCar = new Car("PinkCar.png", 0, 450);
        redCar = new Car("RedCar.png", 0, 550);
        yellowCar = new Car("YellowCar.png", 0, 650);

        this.add(blueCar);
        this.add(greenCar);
        this.add(pinkCar);
        this.add(redCar);
        this.add(yellowCar);

        game = new Timer(30, messageAL);
        game.start();

    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.LIGHT_GRAY);
        g2.clearRect(0, 0, 800, 800);
        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(0, 300, 800, 300);
        g2.drawLine(0, 400, 800, 400);
        g2.drawLine(0, 500, 800, 500);
        g2.drawLine(0, 600, 800, 600);
        g2.drawLine(0, 700, 800, 700);
        g2.setFont(new Font("Times New Roman", Font.BOLD, 50));
        g2.drawString(status, stringX, stringY);
        blueCar.paint(g2);
        greenCar.paint(g2);
        pinkCar.paint(g2);
        redCar.paint(g2);
        yellowCar.paint(g2);

    }

    ActionListener messageAL = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            blueCar.moveCar();
            greenCar.moveCar();
            pinkCar.moveCar();
            redCar.moveCar();
            yellowCar.moveCar();
            isThereIsWinner();
            repaint();
        }
    };

    public void isThereIsWinner() {

        if (blueCar.getX() >= getWidth() - 80) {
            blueCar.setWinner(true);
            this.status = "Blue Car Wins!!!";
            this.stringX = 180;
            game.stop();
        } else if (greenCar.getX() >= this.getWidth() - 80) {
            greenCar.setWinner(true);
            this.status = "Green Car Wins!!!";
            this.stringX = 180;
            game.stop();
        } else if (pinkCar.getX() >= this.getWidth() - 80) {
            pinkCar.setWinner(true);
            this.status = "Pink Car Wins!!!";
            this.stringX = 180;
            game.stop();
        } else if (redCar.getX() >= this.getWidth() - 80) {
            redCar.setWinner(true);
            this.status = "Red Car Wins!!!";
            this.stringX = 180;
            game.stop();
        } else if (yellowCar.getX() >= this.getWidth() - 80) {
            yellowCar.setWinner(true);
            this.status = "Yellow Car Wins!!!";
            this.stringX = 180;
            game.stop();
        }

    }

}
