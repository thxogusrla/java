package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pro2 extends JFrame {
	pro2(){
		setTitle("드래깅동안 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new drag());

		
		setSize(300, 300);
		setVisible(true);
	}
	class drag implements MouseMotionListener{
		public void mouseDragged(MouseEvent e){
			Container c =(Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			Container c = (Container)e.getSource();
			c.setBackground(Color.black);
		}
	}
	public static void main(String[] args) {
		new pro2();
	}
}
