package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����5 extends JFrame {
	private JLabel la = new JLabel("hello");
	
	public ����5() {
		setTitle("����5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MymouseAdapter());
		c.setLayout(null);
		
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(250,250);
		setVisible(true);
	}
	class MymouseAdapter extends MouseAdapter{ //�Ʈ�� ����ϸ� �޼ҵ� �����Ǹ� ���� �ʿ䰡 ����.
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	public static void main(String[] args) {
		new ����5();
	}
}
