package step_6;

import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        DVD dvd = new DVD();
        this.setSize(1200, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("DVD");
        this.add(dvd);
        this.pack();
        this.setVisible(true);
    }
}
