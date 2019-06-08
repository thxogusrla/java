package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����10 extends JFrame {
	����10() {
		setTitle("����10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //Ŭ���Ϸ��°� ���� ���� ����� ���̴�.
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
				int r = (int) (Math.random()*256);
				int g = (int) (Math.random()*256);
				int b = (int) (Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,g,b));
			}
		}
	}
	public static void main(String[] args) {
		new ����10();
	}
}
