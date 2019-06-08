package chapter10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ����7 extends JFrame {
	private JLabel la = new JLabel(); //���̺� ������Ʈ ����.
	public ����7() {
		setTitle("����7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 150);
		setVisible(true);		
		
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter{ //inner Ŭ����.
		public void KeyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"Ű�� �Էµ�.");
			
			if(e.getKeyChar() == '%') contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new ����7();
	}
}
