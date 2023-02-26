package trafficLights-lights-single_version;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class MyPanel extends JPanel {

	MyPanel() {
		this.setPreferredSize(new Dimension(600,600));
		
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		//Drawing background
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRect(0, 0, 600, 600);
		
		//Drawing main thing
		g2D.setColor(Color.black);
		g2D.fillRoundRect(250, 100, 100, 360, 40, 40);
		g2D.fillRoundRect(275, 470, 50, 65, 20, 20);
		g2D.fillArc(270, 80, 60, 30, 0, 180);
		
		//Drawing lights
		g2D.setColor(Color.red);
		g2D.fillOval(265, 140, 70, 70);
		g2D.setColor(Color.yellow);
		g2D.fillOval(265, 250, 70, 70);
		g2D.setColor(Color.green);
		g2D.fillOval(265, 360, 70, 70);
		
		//Drawing thing near TrafficLight
		g2D.setColor(Color.black);
		this.paintThing(240, 140, true, g);
		this.paintThing(240, 250, true, g);
		this.paintThing(240, 360, true, g);
		this.paintThing(360, 140, false, g);
		this.paintThing(360, 250, false, g);
		this.paintThing(360, 360, false, g);
		
		//Drawing white things
		g2D.setColor(Color.white);
		Area area = new Area(new Ellipse2D.Double(260, 115, 80, 80));
		Area temp = new Area(new Ellipse2D.Double(260, 130, 80, 80));
		area.subtract(temp);
		g2D.fill(area);
		
		area = new Area(new Ellipse2D.Double(260, 225, 80, 80));
		temp = new Area(new Ellipse2D.Double(260, 240, 80, 80));
		area.subtract(temp);
		g2D.fill(area);
		
		area = new Area(new Ellipse2D.Double(260, 335, 80, 80));
		temp = new Area(new Ellipse2D.Double(260, 350, 80, 80));
		area.subtract(temp);
		g2D.fill(area);
	}
	
	//Drawing thing near TrafficLight, if true - turns triangle to the left
	public void paintThing(int x, int y, boolean isLeft, Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		if (isLeft) {
			g2D.fillOval(x - 20, y, 20, 20);
			g2D.fillOval(x - 55, y, 20, 20);
			g2D.fillOval(x - 20, y + 36, 20, 20);
			Polygon p = new Polygon();
			p.addPoint(x - 10, y);
			p.addPoint(x - 45, y);
			p.addPoint(x - 53, y + 17);
			p.addPoint(x - 17, y + 53);
			p.addPoint(x, y + 45);
			p.addPoint(x, y + 10);
			g2D.fillPolygon(p);
		} else {
			g2D.fillOval(x, y, 20, 20);
			g2D.fillOval(x + 36, y, 20, 20);
			g2D.fillOval(x, y + 36, 20, 20);
			Polygon p = new Polygon();
			p.addPoint(x + 10, y);
			p.addPoint(x + 45, y);
			p.addPoint(x + 53, y + 17);
			p.addPoint(x + 17, y + 53);
			p.addPoint(x, y + 45);
			p.addPoint(x, y + 10);
			g2D.fillPolygon(p);
		}

	}
}
