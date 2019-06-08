package chapter10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class pro1 extends JFrame {
	private JLabel la = new JLabel("love java");
	pro1(){
		setTitle("문제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.addMouseListener(new listener()); //la 레이블에 이벤트 리스너를 달아줘야함.
		
		c.add(la);
		setSize(300, 300);
		setVisible(true);
	}
	class listener extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			JLabel com = (JLabel)e.getSource();
			com.setText("사랑해");
		}
		public void mouseExited(MouseEvent e) {
			JLabel com = (JLabel)e.getSource();
			com.setText("love 자바");
		}
	}
	public static void main(String[] args) {
		new pro1();
	}
}
