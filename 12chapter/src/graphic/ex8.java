package graphic;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import graphic.ex7.MyPanel;

public class ex8 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex8() {
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
			g.drawImage(img, 20, 20, 250, 100,100, 50, 200, 200, this);
		}
	}
	public static void main(String[] args) {
		new ex8();
	}
}
