package graphic;

import java.awt.*;
import javax.swing.*;

public class ex4 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex4() {
		setTitle("ex4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 370);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(60, 100, 100, 140);
			g.drawArc(20, 100, 80, 80, 90, 270);
		}
	}

	public static void main(String[] args) {
		new ex4();
	}
}
