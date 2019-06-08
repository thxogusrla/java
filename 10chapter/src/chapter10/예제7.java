package chapter10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 예제7 extends JFrame {
	private JLabel la = new JLabel(); //빈레이블 컴포넌트 생성.
	public 예제7() {
		setTitle("예제7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);		
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{ //inner 클래스.
		public void KeyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력됨.");
			
			if(e.getKeyChar() == '%') contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new 예제7();
	}
}
