package graphic;

import java.awt.*;
import javax.swing.*;

public class ex6 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex6() {
		setTitle("ex6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 420);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("1/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}

	public static void main(String[] args) {
		new ex6();
	}
}
