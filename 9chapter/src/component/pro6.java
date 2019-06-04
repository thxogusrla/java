package component;

import javax.swing.*;
import java.awt.*;

public class pro6 extends JFrame {
	pro6() {
		setTitle("random labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		for (int i = 0; i < 20; i++) {

			JLabel la = new JLabel(i+"");
			int x = (int) (Math.random() * 200 + 50); // 50~ 250±îÁö.
			int y = (int) (Math.random() * 200 + 50);
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setBackground(Color.BLUE);
			la.setOpaque(true);
			c.add(la);
		}
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new pro6();
	}
}
