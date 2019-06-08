package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 예제9 extends JFrame {
	private JLabel la = new JLabel("no mouse event");
	public 예제9() {
		setTitle("예제9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener); //마우스 리스너
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300, 200);
		setVisible(true);
		
	}
	class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseDreaaged ("+e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mousemoved (" + e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("mousePressed (" + e.getX() + "," + e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
	}
	public static void main(String[] args) {
		new 예제9();
	}
}
