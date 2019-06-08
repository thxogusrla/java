package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro6 extends JFrame {
	private JLabel la = new JLabel("kth");
	pro6(){
		setTitle("¹®Á¦6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = (int) (Math.random()*400);
				int y = (int) (Math.random()*400);
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
		la.setSize(50,50);
		la.setLocation(100, 100);
		c.add(la);
		setSize(500, 500);
		setVisible(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new pro6();
	}
}
