package step_7;

import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame(){
        MyPanel p = new MyPanel();
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("solar system");
        this.add(p);
        this.pack();
        this.setVisible(true);
    }
}
