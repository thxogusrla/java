package graphic;

import javax.swing.*;
import java.awt.*;

public class ex7 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex7() {
		setTitle("ex7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(200, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("1/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
	public static void main(String[] args) {
		new ex7();
	}
}
