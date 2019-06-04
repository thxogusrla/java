package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 抗力4 extends JFrame {
	private JLabel la = new JLabel("hello!");
	
	public 抗力4(){
		setTitle("抗力4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		


		la.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 抗力4();
	}
}
