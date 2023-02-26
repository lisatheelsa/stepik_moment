package step9;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        Panel panel = new Panel();
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Race");
        this.add(panel);
        this.pack();
        this.setVisible(true);

    }
}
