package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 抗力6 extends JFrame {
	private JLabel[] keyMessage;
	
	public 抗力6() {
		setTitle("抗力6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage[0] = new JLabel(" getkeycode() ");
		keyMessage[1] = new JLabel(" getkeycahr() ");
		keyMessage[2] = new JLabel( "getkeyText() ");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			int keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keycode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keycode));
			
			System.out.println("keypressed"); 
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped");
		}
	}
	public static void main(String[] args) {
		new 抗力6();
	}
}
