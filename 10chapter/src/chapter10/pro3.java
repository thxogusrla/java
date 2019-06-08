package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro3 extends JFrame {
	private JLabel la = new JLabel("love java");
	pro3(){
		setTitle("pro3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeylistener());

		c.add(la);
		setSize(300, 200);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeylistener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT)
				la.setText("avaj evol");
			else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				la.setText("love java");
		}
	}
	public static void main(String[] args) {
		new pro3();
	}
	
}
