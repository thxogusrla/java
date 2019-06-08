package graphic;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;

import graphic.ex7.MyPanel;

public class ex9 extends JFrame {
	private MyPanel panel = new MyPanel();

	public ex9() {
		setTitle("ex7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("1/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 50));
			g.drawString("go Gator!", 10, 150);
		}
	}
	public static void main(String[] args) {
		new ex9();
	}
}
