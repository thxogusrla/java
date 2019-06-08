package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 抗力4 extends JFrame {
	private JLabel la = new JLabel("hello!");

	public 抗力4() {
		setTitle("抗力4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});
		c.setLayout(null);

		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new 抗力4();
	}
}
