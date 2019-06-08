package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro5 extends JFrame {
	private JLabel la = new JLabel("love java");

	pro5() {
		setTitle("pro5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		la.setFont(new Font("Arial", Font.PLAIN, 10));
		Container c = getContentPane();
		la.addKeyListener(new Mykeylistener());
		c.setLayout(new FlowLayout());
		c.add(la);

		setSize(300, 300);
		setVisible(true);

		la.setFocusable(true);
		la.requestFocus();
	}

	class Mykeylistener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Font f = la.getFont();
			int size = f.getSize();
			if (e.getKeyCode() == 45) {
				if (size > 5)
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
			} else if (e.getKeyCode() == 61)
				la.setFont(new Font("Arial", Font.PLAIN, size + 5));
		}
	}

	public static void main(String[] args) {
		new pro5();
	}
}