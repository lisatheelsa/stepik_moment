package snowman;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		MyPanel panel = new MyPanel();
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Snowman");
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
	
}
