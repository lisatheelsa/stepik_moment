package trafficLights-lights-single_version;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	MyFrame() {
		MyPanel panel = new MyPanel();
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Traffic Light");
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}

}
