package graphic;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pro1 extends JFrame {
	private MyPanel panel = new MyPanel();
	private JButton btn = new JButton("hide/show");

	public pro1() {
		setTitle("pro1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setLayout(new FlowLayout());
		panel.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton bt = (JButton) e.getSource();

			}
		});
		setSize(400, 200);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("1/cherry.jpg");
		private Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

			repaint();
		}
	}

	public static void main(String[] args) {
		new pro1();
	}
}
