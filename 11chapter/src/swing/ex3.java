package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ex3 extends JFrame {

	ex3() {
		
		setTitle("ex3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("1/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("1/rolloverIcon");
		ImageIcon pressedIcon = new ImageIcon("1/pressedIcon");

		JButton btn = new JButton("call", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ex3();
	}
}
