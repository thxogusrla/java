package graphic;

import java.awt.*;
import javax.swing.*;

public class ex5 extends JFrame {
	private MyPanel panel = new MyPanel();

	ex5() {
		setTitle("ex5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 370);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(10, 10, 30, 30);
			g.drawRect(20, 20, 20, 10);
			int x[] = { 10, 5, 15 };
			int y[] = { 10, 15, 20 };
			g.drawPolygon(x, y, 3);
			g.fillPolygon(x, y, 3);
		}
		
	}

	public static void main(String[] args) {
		new ex5();
	}
}
