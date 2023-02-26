package step_5;

import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        MyPanel panel = new MyPanel();
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("square tooooop");
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
